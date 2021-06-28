package day10;

import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class JsonValidateDemo {
    public static void main(String args[]){
        String[] str={"123","abc","123","ghu","gg"};
/*        HashSet hash=new HashSet();
        hash.add("123");
        hash.add("123");
        hash.add("123");

        for(Object s:hash){
            System.out.println(hash.g);
        }*/

        //定义字符串
        String s1="[{\"value\":0,\"expression\":\"$.code\"},{\"value\":\"OK\",\"expression\":\"$.msg\"},{\"value\":\"OK\",\"expression\":\"OK\"}]";
        String s2="[{\"value\":\"OK\",\"expression\":\"OK\"},{\"value\":\"OK\",\"expression\":\"OK\"},{\"value\":\"OK\",\"expression\":\"OK\"}]";
       //字符串数组转成List集合:需要先定义一个对象，使用集合的泛型来调用该对象
        List<JsonValidate> list =JSONObject.parseArray(s1,JsonValidate.class);
//        System.out.println(list.toString());
        //对list集合中的数据进行遍历
        for(int i=0;i<list.size();i++){
            //使用equals方法对两者的值进行比较
            if(list.get(i).getValue().equals(list.get(i).getExpression())){
                //相等则返回pass
                System.out.println("Pass");
            }else{
                //不等则返回fail
                System.out.println("Fail");
            }
        }

    }
}
