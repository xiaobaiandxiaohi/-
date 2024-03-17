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

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@WebServlet("/redownServlet")
public class redownServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","text/html;charset=UTF-8");


        String mid  = request.getParameter("mid");
        Contdao lj=new ContdaoImpl();
        Cont xx=lj.ByMid(mid);
        System.out.println(xx);

        System.out.println("重新下载");

        String docxModelName = xx.getMname();
        System.out.println(docxModelName);
        String part = request.getServletContext().getRealPath(File.separator + "static" + File.separator + "docx");
        System.out.println("模版在服务器真实位置："+part);
        String docxModelPath = part+ File.separator +docxModelName;
        Document doc = new Document();
        doc.loadFromFile(docxModelPath, FileFormat.Docx);

        Map<String, String> map = new HashMap<>();
//uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj


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
        String newDocxName =xx.getMid();
        doc.saveToFile(part+ File.separator +newDocxName, FileFormat.Docx);


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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","text/html;charset=UTF-8");


        String mid  = request.getParameter("mid");
        Contdao lj=new ContdaoImpl();
        Cont xx=lj.ByMid(mid);
        System.out.println(xx);

        System.out.println("重新下载");

        String docxModelName = xx.getMname();
        System.out.println(docxModelName);
        String part = request.getServletContext().getRealPath(File.separator + "static" + File.separator + "docx");
        System.out.println("模版在服务器真实位置："+part);
        String docxModelPath = part+ File.separator +docxModelName;
        Document doc = new Document();
        doc.loadFromFile(docxModelPath, FileFormat.Docx);

        Map<String, String> map = new HashMap<>();
//uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj


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
        String newDocxName =xx.getMid();
        doc.saveToFile(part+ File.separator +newDocxName, FileFormat.Docx);


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
