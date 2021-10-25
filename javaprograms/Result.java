class Result
{
public static void main(String[] marks)
{
for(int mark=0; mark<marks.length; mark++)
{
String cgpa= marks[mark];
float per= Float.parseFloat(cgpa);
System.out.println(per +"\t");
int percentage= Integer.parseInt(cgpa);
System.out.println(percentage +"\t");
double pe= Double.parseDouble(cgpa);
System.out.println(pe +"\t");
byte percent= Byte.parseByte(cgpa);
System.out.println(percent +"\t");
}
}
}