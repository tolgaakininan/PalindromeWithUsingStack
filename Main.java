import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        ArrayStack stack=new ArrayStack(20);
        System.out.print("Enter a word: ");
        String kelime=oku.nextLine();
        kelime=kelime.toLowerCase();
        char[] kelimeArr=kelime.toCharArray();
        int j=0;
        char[] newKelimeArr = new char[kelimeArr.length];
        int len=0;
        for(int i=0;i<kelimeArr.length;i++)
        {
            if(kelimeArr[i]>='a'&&kelimeArr[i]<='z')
            {
                newKelimeArr[j++]=kelimeArr[i];
                len++;
            }
        }
        System.arraycopy(newKelimeArr,0,kelimeArr,0,len);
        for(j=0;j<len;j++)
        {
            stack.push(kelimeArr[j]);
        }
        boolean isPalindrome=true;
        for(j=0;j< (kelimeArr.length/2)+1;j++)
        {
            if(stack.pop()!=kelimeArr[j])
            {
                isPalindrome=false;
            }
        }
        if(isPalindrome)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}