package programe;
import java.io.*;
import java.util.Scanner;

public class Tools {

    public static void insert(String filePath, String s) throws Exception {
        String temp_file = "temp.txt";

        File OldFile = new File ("database\\" + filePath);
        File NewFile = new File ("database\\" + temp_file);
        try {

            FileWriter fw = new FileWriter ("database\\" + temp_file, true);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter pw = new PrintWriter (bw);
            Scanner sc = new Scanner (OldFile);
            while (sc.useDelimiter (":").hasNext ()) {
                String ns = sc.nextLine ();
                pw.println (ns);

            }
            sc.close ();
            pw.flush ();

            pw.println (s);
            pw.close ();
            OldFile.delete ();
            File dump = new File ("database\\" + filePath);
            NewFile.renameTo (OldFile);


        } catch (FileNotFoundException e) {
            System.out.println (e.getMessage ());

        }

    }

    public static void delete(String filePath, String s) throws Exception {
        String temp_file = "temp.txt";

        File OldFile = new File ("database\\" + filePath);
        File NewFile = new File ("database\\" + temp_file);
        try {

            FileWriter fw = new FileWriter ("database\\" + temp_file, true);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter pw = new PrintWriter (bw);
            Scanner sc = new Scanner (OldFile);
            while (sc.useDelimiter (":").hasNext ()) {
                String ns = sc.nextLine ();
                if (ns.equals (s)) {


                } else {
                    pw.println (ns);
                }


            }
            sc.close ();
            pw.flush ();
            pw.close ();
            OldFile.delete ();
            File dump = new File ("database\\" + filePath);
            NewFile.renameTo (dump);


        } catch (FileNotFoundException e) {
            System.out.println (e.getMessage ());

        }

    }

    public static void Update(String filePath, String olds, String news) throws Exception {
        String temp_file = "temp.txt";

        File OldFile = new File ("database\\" + filePath);
        File NewFile = new File ("database\\" + temp_file);
        try {

            FileWriter fw = new FileWriter ("database\\" + temp_file, true);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter pw = new PrintWriter (bw);
            Scanner sc = new Scanner (OldFile);
            while (sc.useDelimiter (":").hasNext ()) {
                String ns = sc.nextLine ();

                if (ns.equals (olds)) {
                    pw.println (news);

                } else {
                    pw.println (ns);

                }


            }
            sc.close ();
            pw.flush ();
            pw.close ();
            OldFile.delete ();
            File dump = new File ("database\\" + filePath);
            NewFile.renameTo (OldFile);


        } catch (FileNotFoundException e) {
            System.out.println (e.getMessage ());

        }

    }

    public static String[] search(String filePath, String s) throws Exception {
        String[] arr = new String[8];
        boolean flage=false;
        File OldFile = new File ("database\\" + filePath);

        try {

            Scanner sc = new Scanner (OldFile);

            while (sc.useDelimiter (":").hasNextLine()) {
                String ns= sc.nextLine ();
                arr=ns.split (":",8);
                if (arr[0].equals (s)){
                    flage=true;
                    break;
                }
            }

            sc.close ();


        } catch (FileNotFoundException e) {
            System.out.println (e.getMessage ());

        }
        if (flage){
            return arr;
        }else {
            return null;
        }

    }




}
