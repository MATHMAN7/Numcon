public class che {


    static boolean check(String input) {
        boolean order=true;

        int a=0;
        int b=0;   // these are for starting indexes of the words billion, million and thousand
        int c=0;

        int countB=0;
        int countM=0;   // these are the numbers of times they show up
        int countT=0;


        int indexB=input.indexOf("billion");
        int indexM=input.indexOf("million");   // these are the indexes of the words
        int indexT=input.indexOf("thousand");

        while (input.indexOf("billion",a)!=-1){
            if(!input.contains("billion")){break;}   // Loop to counts how many times the word a Billion appears in the text
            a=input.indexOf("billion",a)+1;
            countB=countB+1;}

        while (input.indexOf("million",b)!=-1){
            if(!input.contains("million")){break;}     //this while loop counts how many times the word a Million appears in the text
            b=input.indexOf("million",b)+1;
            countM=countM+1;}

        while (input.indexOf("thousand",c)!=-1){
            if(!input.contains("thousand")){break;}     //this while loop counts how many times the word a Thousand appears in the text
            c=input.indexOf("thousand",c)+1;
            countT=countT+1;}



        if(indexB==-1){indexB=-100;}
        if(indexM==-1){indexM=indexB+1;}     // here we just make sure that if the words
        if(indexT==-1){indexT=indexM+1;}     // do not appear we still treat them as if they were in the correct order

        if ((indexB < indexM && indexM < indexT) &&
                (countB == 1 || countB == 0) &&
                (countM == 1 || countM == 0) &&
                (countT == 1 || countT == 0)) {
            order = false;
        }



        return  order;
    }
}
