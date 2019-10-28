package com.classbook.chapter.six;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: classprogram
 * @Description:
 * @author: Miss.Yang
 * @date: 2019/10/23 2:14 下午
 */
public class BookManager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","CookBook",90,9);
        //x子类访问父类的 protect 成员变量
        int pages = dictionary.pages;
        //类型转换 int 转 String
        display(String.valueOf(pages));
        display(dictionary.getBookName());

        Book book = new Book("INB002","James",70);
        display(book.getBookId());
        Book bookdictionary = new Dictionary("INB003","Toms",98,8);
        display(bookdictionary.getBookId());


        //final
    }

    /**
    * @Description: 显示结果
    * @Param: [content]
    * @return: void
    * @Author: Miss.Yang
    * @Date: 2019/10/23 2:24 下午
    */
    public static void display(String content){
        System.out.println(content);
    }
}
