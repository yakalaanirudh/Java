public class StringPractice2 {

    public static void main(String[] args) {


        String str1="Mr. Anirudh";
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("A" , 4));
        System.out.println(str1.endsWith("h"));
        System.out.println(str1.charAt(4));

        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i));


        String str2="www.udemy.co.in";
        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf(".",4));
        System.out.println(str2.indexOf("udemy"));
        System.out.println(str2.lastIndexOf("."));
    }

}
/*
Output is
true
true
true
A
Mr. Shahrukh Khan3
9
4
12
 */