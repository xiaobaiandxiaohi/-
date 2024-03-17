package com;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.documents.TextSelection;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class TestSpireWord {
    public static void main(String[] args) {
        generateAndReplaceText();
    }

    public static void generateAndReplaceText() {
        Document doc = new Document();
        doc.loadFromFile("G:\\11\\111.docx", FileFormat.Docx);

        Map<String, String> map = new HashMap<>();
        map.put("${name}", "张山");
        map.put("${title}", "篇幅不要太长控制在300字以内，做到突出自身符合目标岗位要求的卖点，避免过多使用形容词，而通过数据及实例对自身价值进行深化，如：会计研究生毕业，CPA，CFA一级，会计师中级职称。性格踏实、稳健，善于沟通和聆听，乐观向上有上市公司财务管理经验 在大型企业专注财务X年，擅长核算、预算、资产、报表分析等工作并有效满足公司相关需求，独立开展过财务信息系统的工作。");

//        map.put("${result}", "成功");
//        map.put("${col}", "第一列");
//        map.put("${col1}", "第二列");
//        map.put("${col2}", "第三列");
        replaceSpecialWord(doc, map);
        // 保存为文件
        doc.saveToFile("G:\\11\\11\\111.docx", FileFormat.Docx);
        // 或者保存至输出流中
        //ByteArrayOutputStream os = new ByteArrayOutputStream();
        //doc.saveToStream(os, FileFormat.Docx);
    }

    /**
     * 替换Word文件中 ${} 标识的特殊字符
     * <br>
     * <strong>注意：如果存在部分特殊表示无法替换，请尝试将 ${} 的整个字符串复制到word中，有可能word没有将${}识别为一个整体</strong>
     * @param doc: Sprire Document
     * @param map: 占位符${} 与 需要替换的为字符串的对应关系
     */
    public static void replaceSpecialWord(Document doc, Map<String, String> map) {
        // 正则表达式，匹配所有的占位符 ${}
        Pattern pattern = Pattern.compile("\\$\\{.*?}");
        // 根据正则表达式获取所有文本
        TextSelection[] allPattern = doc.findAllPattern(pattern);
        // 逐个替换占位符
        for (TextSelection textSelection : allPattern) {
            String tmp = map.get(textSelection.getSelectedText());
            System.out.print(textSelection.getSelectedText());
            int res = doc.replace(textSelection.getSelectedText(), tmp, true, true);
            System.out.println(": " + res);
        }
    }
}

