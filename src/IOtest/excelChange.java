package IOtest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.WorkbookSettings;

public class excelChange {
    public static void main(String[] args) throws IOException, BiffException {
        FileInput fileInput = new FileInput("C:\\Users\\DELL\\Desktop\\医生表新增测试.xls");
        fileInput.fileRead();
        String fileOutputName = "";
 //       fileInput.build2Int2Double(fileOutputName,fileInput.getLists(),fileInput.getLists().get(2).size(),2);
    //    fileInput.buildImportExport(fileOutputName,fileInput.getLists(),fileInput.getLists().get(1).size(),1);
    }
}
class FileInput{
    private String fileNameInput;
    private String fileNameOutput;
    private List<List> lists = new ArrayList<>();
    public FileInput(String fileNameInput) {
        this.fileNameInput = fileNameInput;
    }

    public String getFileNameInput() {
        return fileNameInput;
    }

    public List<List> getLists() {
        return lists;
    }

    public void setLists(List<List> lists) {
        this.lists = lists;
    }

    public void setFileNameInput(String fileNameInput) {
        this.fileNameInput = fileNameInput;
    }

    public String getFileNameOutput() {
        return fileNameOutput;
    }

    public void setFileNameOutput(String fileNameOutput) {
        this.fileNameOutput = fileNameOutput;
    }

    /**
     * 读入文件,将excel中文件读到暂存lists中
     * @throws IOException
     * @throws BiffException
     */
    public void fileRead() throws IOException, BiffException {
        InputStream fileInputStream = new FileInputStream(fileNameInput);
        WorkbookSettings workbookSettings = new WorkbookSettings();
        workbookSettings.setEncoding("ISO-8859-1");
        Workbook workbookRead = Workbook.getWorkbook(fileInputStream,workbookSettings);
        System.out.println(workbookRead.getNumberOfSheets());
        //获得到对应列
        Sheet sheet = workbookRead.getSheet(0);
        int[] nums = new int[11];
        lists = new ArrayList<List>();
        //获得Excel表中各列存到list中
        getList(sheet,lists);
        checkList(lists.get(2),lists.get(2).size());
        for (int i = 0;i < sheet.getRows();i++){
            for (int j = 0;j < sheet.getColumns();j++){
                String temp = sheet.getCell(j,i).getContents();
                System.out.println(temp + "  ");
            }
            System.out.println();
        }

        workbookRead.close();
    }
    /**
     * 将已读入的sheet文件读入List列表
     */
    private void getList(Sheet sheet,List lists){
        List<String> oneList = null;
        for (int i = 0;i < sheet.getColumns();i++){
            oneList = new ArrayList<>();
            Cell[] columnTemp = sheet.getColumn(i);
            for (int j = 0;j < columnTemp.length;j++){
                oneList.add(columnTemp[j].getContents());
            }
            lists.add(oneList);
        }
    }

    /**
     * 函数功能是实现list中大写字母转小写字母
     *
     * @param list 传入list是Excel表的列
     */
    private void checkList(List list,int length){
        for (int i = 0;i < length;i++){
            boolean isRight = true;
            char[] tempChar = String.valueOf(list.get(i)).toCharArray();
            for (int j = 0;j < tempChar.length;j++){
                if (!isRuled(tempChar[j])){
                    isRight = false;
                }
            }
            if (!isRight){
                System.out.println((i + 1) + "行存在格式问题");
            }
            else {
                System.out.println((i + 1) + "行ok");
            }
        }
    }
    /**
     *
     * @param word 传入待判断的字母
     * @return  如果符合规定就返回TRUE
     */
    private boolean isRuled(char word){
        if ((word >= 'a' && word <= 'z')){
            return true;
        }
        else if (word == '_'){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     *
     * @param fileNameOut  输出文件所存储的位置
     * @param lists   存储excel列表的list
     * @param listLenth  存储list列表的长度
     * @param num  存储第num个list列表
     */
    public void build2Int2Double(String fileNameOut,List lists,int listLenth,int num) throws FileNotFoundException {
       // FileOutputStream fileOutputStream = new FileOutputStream(fileNameInput);
        StringBuilder stringBuilder = new StringBuilder();
        List<String> oneList = (List<String>) lists.get(num);
        List<String> twoList = (List<String>) lists.get(num + 1);
        for (int i = 1;i < listLenth;i++){
            stringBuilder.append("{     \t\n");
            stringBuilder.append("\t\"key\":\""+ oneList.get(i)+"\",\n");
            if ("Integer".equals(twoList.get(i))){
                stringBuilder.append("\t\"action\":\"toInt\"\n");
            }
            else {
                stringBuilder.append("\t\"action\":\"toDouble\"\n");
            }
            stringBuilder.append("},\n");
        }
        System.out.println(stringBuilder);
    }
    public void buildImportExport(String fileNameOutput,List lists,int listLenth,int num) throws FileNotFoundException{
        StringBuilder stringBuilder = new StringBuilder();
        List<String>zeroList = (List<String>) lists.get(num);
        List<String> oneList = (List<String>) lists.get(num + 1);
        List<String> twoList = (List<String>) lists.get(num + 2);
        for (int i = 1;i < listLenth;i++){
            stringBuilder.append("{     \t\n");
            stringBuilder.append("\t\"name\":\"" + zeroList.get(i) + "\",\n");
            stringBuilder.append("\t\"field\":\"" + oneList.get(i) + "\",\n");
            if ("Integer".equals(twoList.get(i))){
                stringBuilder.append("\t\"data_type\":\"INTEGER\",\n");
                stringBuilder.append("\t\"formatdata\":\"toInteger\",\n");
            }
            else {
                stringBuilder.append("\t\"data_type\":\"DOUBLE\",\n");
                stringBuilder.append("\t\"formatdata\":\"toDOUBLE\",\n");
            }
            stringBuilder.append("\t\"required\":false,\n");
            stringBuilder.append("\t\"is_filter\":true,\n");
            stringBuilder.append("\t\"is_filter_import\":false,\n");
            stringBuilder.append("\t\"is_filter_import\":false\n");
            stringBuilder.append("},\n");
        }
        System.out.println(stringBuilder);
    }
}