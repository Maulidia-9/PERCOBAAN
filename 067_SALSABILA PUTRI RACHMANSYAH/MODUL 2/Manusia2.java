class manusia
{ String
nama; int
usia; manusia
(){
this.nama = "tanpa
nama"; this.usia = 0;
}
manusia (String nama, int
usia){ this.nama=
nama; this.usia =
usia;
}
void cetak(){
if (nama==null&&usia=0)
return;
System.out.println("Nama : "+nama);
System.out.println("Usia : "+usia +"\n");}