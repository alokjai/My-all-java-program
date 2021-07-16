import java.io.*;
import java.net.*;

class Myserver
{
  public static void main(String[] alok)
  {
    try
     {
       ServerSocket sos = new ServerSocket(6666);
       Socket soc = sos.accept();
       ObjectInputStream ols = new ObjectInputStream