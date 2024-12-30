package de;
public class IsVaildIpAddress {
public static void main(String[] args) {
String input = "172.001.154.1";
input = input.replace('.', ' ');
String[] data = input.split(" ");
int num = 0;
boolean isvalid = false;
if (data.length != 4) isvalid = false;
else {
for (int i = 0; i < data.length; i++) {
num = Integer.parseInt(data[i]);
if ((num < 0) || (num<=255)) {
isvalid = false;
} 
} 
}
 if (isvalid == false) {
 System.out.println("Valid IPv4 Address");
}
}
}