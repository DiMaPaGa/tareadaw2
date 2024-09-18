package com.example.demo;

import java.io.FileReader; 
                      

                        
                       public class Main { 
                      

                           public static void main(String args[]) 
                      

                           { 
                      

                               try { 
                      

                                   FileReader fileReader = new FileReader( 
                      

                                       "archivo.txt"); 
                      

                                   char c = (char)fileReader.read(); 
                      

                                   System.out.print(c); 
                      

                                   fileReader.close(); 
                      

                               } 
                      

                               catch (Exception e) { 
                      

                                   System.out.println("Error: " + e.toString()); 
                      

                               } 
                      

                           }
                        } 
                      
