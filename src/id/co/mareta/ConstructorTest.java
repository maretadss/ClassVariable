/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.mareta;

/**
 *
 * @author user
 */
public class ConstructorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department dep = new Department("Finance Department");
        dep.setAddress("Sudirman Street");
        dep.setEmail("finance@indocyber.co.id");
        dep.setPhoneNumber("021-999999999");
      
        
//=====================================================
//        Employee pegawai = new Employee();
//        System.out.println("Nama : " + pegawai.getEmployee());
//        System.out.println("Gaji : " + pegawai.salary);
//        System.out.println("");
////=======================================================
//        Employee staf = new Employee("Mareta", 5000000.00);
//        System.out.println("Nama : " + staf.getEmployee());
//        System.out.println("Gaji : " + staf.);
//        System.out.println("");
////=========================================================
//        Employee karyawan = new Employee("Mareta", 9000000.00, 17);
//        System.out.println("Nama : " + karyawan.employeeName);
//        System.out.println("Gaji : " + karyawan.salary);
//        System.out.println("Age : " + karyawan.age);
//        System.out.println(karyawan); //in tidak informatif
//        
// // ======================================================
//        Student pelajar =  new Student ("Smith");//memanggil yang default
//        System.out.println("");
//        
//        System.out.println(pelajar);//initidak informatif
//    }
  //=====================================================
    //dalam satu kelas yang sama dia tidak bisa dipanggil jaika tidak static
    
    }

}
