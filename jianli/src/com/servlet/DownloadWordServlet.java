package com.servlet;

import com.bean.Cont;
import com.bean.Qiuzhi;
import com.bean.User;
import com.dao.Contdao;
import com.dao.daoiml.ContdaoImpl;
import com.dao.daoiml.qiuzhidaoimpl;
import com.dao.qiuzhidao;
import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.documents.TextSelection;
import com.utils.UUIDUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 参加地址：https://blog.csdn.net/qq_38431321/article/details/121240987
 * 使用jar包：Spire.Doc.jar 大小37MB
 * 步骤
 * 1.用户选择模版+选择条简历  把模版id  和 简历id 数据传到这个servlet进行处理
 * 2.根据传过来的模版id到数据库查询模版名称    根据简历id到数据库查询简历详细
 * 3.获取模版在服务器真实位置 并获取模版
 * 4.根据查询的简历 替换 字段
 * 5.把替换后的简历保存到服务器
 * 6.下载
 * 7.删除保存在服务器的简历
 */
@WebServlet("/DownloadWordServlet")
public class DownloadWordServlet extends HttpServlet{


    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","text/html;charset=UTF-8");



        HttpSession session = request.getSession();
        Object userObject = session.getAttribute("user");
        User user = (User) userObject;
        String userName = user.getUsername();
        qiuzhidao qz=new qiuzhidaoimpl();
        Qiuzhi xx=qz.userinf(userName);


        String docxModelName = request.getParameter("mname");
        System.out.println(docxModelName);
        String part = request.getServletContext().getRealPath(File.separator + "static" + File.separator + "docx");
        System.out.println("模版在服务器真实位置："+part);
        String docxModelPath = part+ File.separator +docxModelName;
        Document doc = new Document();
        doc.loadFromFile(docxModelPath, FileFormat.Docx);

        Map<String, String> map = new HashMap<>();
//uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj

        String uname = xx.getUname();
        String name = xx.getName();
        String age = xx.getAge();
        String phone = xx.getPhone();
        String address = xx.getAddress();
        String email = xx.getEmail();
        String workyear = xx.getWorkyear();
        String cszy = xx.getCszy();
        String qwyz = xx.getQwyz();
        String school = xx.getSchool();
        String schooldate = xx.getSchooldate();
        String major = xx.getMajor();
        String education = xx.getEducation();
        String zs = xx.getZs();
        String gs1 = xx.getGs1();
        String zw1 = xx.getZw1();
        String zzsj1 = xx.getZzsj1();
        String sqyx1 = xx.getSqyx1();
        String gzms1 = xx.getGzms1();
        String gs2 = xx.getGs2();
        String zw2 = xx.getZw2();
        String zzsj2 = xx.getZzsj2();
        String sqyx2 = xx.getSqyx2();
        String gzms2 = xx.getGzms2();
        String zwpj = xx.getZwpj();
        map.put("${name}",xx.getName());
        map.put("${age}", xx.getAge());
        map.put("${phone}",xx.getPhone());
        map.put("${address}",xx.getAddress());
        map.put("${email}", xx.getEmail());
        map.put("${workyear}",xx.getWorkyear());
        map.put("${cszy}", xx.getCszy());
        map.put("${qwyz}", xx.getQwyz());
        map.put("${school}", xx.getSchool());
        map.put("${schooldate}",xx.getSchooldate());
        map.put("${major}", xx.getMajor());
        map.put("${education}",xx.getEducation());
        map.put("${zs}", xx.getZs());
        map.put("${gs1}", xx.getGs1());
        map.put("${zw1}", xx.getZw1());
        map.put("${zzsj1}", xx.getZzsj1());
        map.put("${sqyx1}", xx.getSqyx2());
        map.put("${gzms1}", xx.getGzms2());
        map.put("${gs2}", xx.getGs2());
        map.put("${zw2}", xx.getZw2());
        map.put("${zzsj2}",xx.getZzsj2());
        map.put("${sqyx2}",xx.getZzsj2());
        map.put("${gzms2}",xx.getGzms2());
        map.put("${zwpj}", xx.getZwpj());


        replaceSpecialWord(doc, map);
        String newDocxName = UUIDUtils.getUuid()+".docx";
        doc.saveToFile(part+ File.separator +newDocxName, FileFormat.Docx);

        Cont lj= new Cont(newDocxName,docxModelName,uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj);
        Contdao cont=new ContdaoImpl();
        if(cont.add(lj))
        {
            System.out.println("写入成功");
        }
        //6.下载
        // 下面代码为下载代码
        ServletContext ctx = request.getServletContext();
        // 建议浏览器保存文件
        response.setHeader("Content-Disposition", "attachment; filename="
                + newDocxName);
        // 获取输入流
        InputStream is = ctx.getResourceAsStream("/static/docx/"+newDocxName);

        int read = 0;
        byte[] bytes = new byte[1024];

        // 只是IO操作。读输入文件字节，写到输出流
        OutputStream os = response.getOutputStream();
        while ((read = is.read(bytes)) != -1) {
            os.write(bytes, 0, read);
        }
        os.flush();
        os.close();

        //7.删除保存在服务器的简历
        // 下载完成 删除生成在服务器上的的简历 因为生成用现在后 生成的简历就没用了
        File newDocx = new File(part+ File.separator +newDocxName);
        if (newDocx.exists()) {
            newDocx.delete();
        }
    }




    public static void replaceSpecialWord(Document doc, Map<String, String> map) {
        // 正则表达式，匹配所有的占位符 ${}
        Pattern pattern = Pattern.compile("\\$\\{.*?}");
        // 根据正则表达式获取所有文本
        TextSelection[] allPattern = doc.findAllPattern(pattern);
        // 逐个替换占位符
        for (TextSelection textSelection : allPattern) {
            String tmp = map.get(textSelection.getSelectedText());
            //System.out.print(textSelection.getSelectedText());
            int res = doc.replace(textSelection.getSelectedText(), tmp, true, true);
            //System.out.println(": " + res);
        }
    }
}
