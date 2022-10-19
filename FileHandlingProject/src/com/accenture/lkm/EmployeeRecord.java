package com.accenture.lkm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeRecord {

	public static void main(String[] args) throws IOException
    {
        BufferedReader buf=new BufferedReader(new FileReader("C:\\Users\\kausar.khan\\record.txt"));
        
        String c=null;
        String []arrofstr=new String[10];
        while((c=buf.readLine())!= null)
        {
             arrofstr =c.split("~",0);
            
            
            for(int i=0;i<arrofstr.length;i++)
            {
                System.out.print( " "+arrofstr[i]);
            }
            System.out.println();
        }
 
    }
}
