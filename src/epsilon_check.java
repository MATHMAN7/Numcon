import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class epsilon_check {
    static boolean check_epsilon(String realInput) {





        boolean isit=true;


        ArrayList<String> list10To19 = new ArrayList<>(Arrays.asList("ten"
                , "eleven", "twelve", "thirteen", "fourteen", "fifteen"
                , "sixteen", "seventeen", "eighteen", "nineteen"));

        ArrayList<String> listtens = new ArrayList<>(Arrays.asList(
                "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"));

        ArrayList<String> list0To9 = new ArrayList<>(Arrays.asList("zero", "one", "two"
                , "three", "four", "five", "six", "seven", "eight", "nine"));




        realInput = realInput.trim().toLowerCase().replaceAll("[^a-z]", "");






        if(realInput.contains("hundred"))
        { String sub2=realInput.substring(realInput.indexOf("hundred")+7);
            if(sub2.contains("hundred")){isit=false;}
            realInput=realInput.substring(0,realInput.indexOf("hundred")+7);


            for(int i=0;i<list10To19.size();i++){
                if(sub2.contains(list10To19.get(i))){
                    for(int o=0;o<list10To19.size();o++){
                        String subsub2=sub2.substring(0,sub2.indexOf(list10To19.get(i)))+sub2.substring(sub2.indexOf(list10To19.get(i))+list10To19.get(i).length());
                        if(subsub2.contains(list10To19.get(o))){isit=false;}}

                    for(int j=0;j<list0To9.size();j++){
                        String subsub2=sub2.substring(0,sub2.indexOf(list10To19.get(i)))+sub2.substring(sub2.indexOf(list10To19.get(i))+list10To19.get(i).length());
                        if(subsub2.contains(list0To9.get(j))){isit=false;}}

                    for(int k=0;k<listtens.size();k++){
                        String subsub2=sub2.substring(0,sub2.indexOf(list10To19.get(i)))+sub2.substring(sub2.indexOf(list10To19.get(i))+list10To19.get(i).length());
                        if(subsub2.contains(listtens.get(k))){isit=false;}}


                }}

            int indexones=-1;
            int indextens=-100;

            for(int i=0;i<listtens.size();i++){
                if(sub2.contains(listtens.get(i))){
                    indextens=sub2.indexOf(listtens.get(i));
                    String subsub3=sub2.substring(0,sub2.indexOf(listtens.get(i)))+sub2.substring(sub2.indexOf(listtens.get(i))+listtens.get(i).length());
                    if(subsub3.contains(listtens.get(i))){isit=false;}
                }}


            String sub5=sub2;
            for(int i=0;i<listtens.size();i++){
                if(sub2.contains(listtens.get(i))){
                    sub5=sub5.substring(0,sub5.indexOf(listtens.get(i)))+
                            sub5.substring(sub5.indexOf(listtens.get(i))+listtens.get(i).length());}}

            for(int i=0;i<list0To9.size();i++){
                if(sub5.contains(list0To9.get(i))){
                    indexones=sub2.indexOf(list0To9.get(i));

                    for(int w=0;w<list0To9.size();w++){
                        if(sub5.contains(list0To9.get(w))){
                            sub5 = sub5.substring(0, sub5.indexOf(list0To9.get(w))) +
                                    sub5.substring(sub5.indexOf(list0To9.get(w)) + list0To9.get(w).length());
                            for(int y=0;y<list0To9.size();y++){
                                if(sub5.contains(list0To9.get(y))){isit=false;}
                            }

                        }
                    }


                    int idx = sub5.indexOf(list0To9.get(i));
                    if (idx != -1) {
                        String subsub4 = sub5.substring(0, idx) + sub5.substring(idx + list0To9.get(i).length());






                        if(subsub4.contains(list0To9.get(i))){isit=false;}}
                }}
            if(indexones!=-1 && indextens!=-100 && indexones < indextens){
                isit=false;
            }
        }


        //


        String finalstring=realInput;
        if(realInput.contains("hundred")) {finalstring=realInput.substring(0,realInput.indexOf("hundred")+7);
            for(int i=0;i<listtens.size();i++){
                if(finalstring.contains("hundred")){
                    if(finalstring.contains(listtens.get(i))){isit=false;}}
            }
            for(int i=0;i<list10To19.size();i++){
                if(finalstring.contains("hundred")){
                    if(finalstring.contains(list10To19.get(i))){isit=false;}}
            }
            boolean onehun=false;
            for(int i=0;i<list0To9.size();i++){

                if(finalstring.contains(list0To9.get(i))){onehun=true;}
            }
            if(onehun==false){isit=false;}}



        int indexHundredand = realInput.indexOf("hundred");

        if (indexHundredand != -1) {
            String subhundredand = realInput.substring(0, indexHundredand)
                    + realInput.substring(indexHundredand + 7);

            if (subhundredand.contains("hundred")) {
                isit = false;
            }
        }













        String sub=realInput;
        for(int i=0;i<listtens.size();i++){
            if(sub.contains(listtens.get(i))) {
                sub=sub.substring(0, sub.indexOf(listtens.get(i)))+sub.substring(sub.indexOf(listtens.get(i))
                        + listtens.get(i).length());
            }}

        for(int i=0;i< list0To9.size();i++){
            if(sub.contains(list0To9.get(i))){
                for(int j=0;j< list0To9.size();j++){

                    String  subbeta=sub.substring(0,sub.indexOf(list0To9.get(i)))+sub.substring(sub.indexOf(list0To9.get(i))
                            +list0To9.get(i).length());


                    if(subbeta.contains(list0To9.get(j))){isit=false;}
                }
                int indexOFtensbefore100=realInput.indexOf(list0To9.get(i));
                if(indexHundredand==-1){indexHundredand=indexOFtensbefore100+1;}
                if(indexHundredand<indexOFtensbefore100){isit=false;}
            }


        }



        isit=!isit;




        return isit;


    }}



