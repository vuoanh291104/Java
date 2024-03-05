import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testPerson {

    private static File file = new File("data.bin");
    private static List<Student> dsStudent = new ArrayList<>();
    private static List<Staff> dsStaff = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void Load() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            while(true) {
                Object o = ois.readObject();
                if(o instanceof Student) {
                    dsStudent.add((Student)o);
                }else if(o instanceof Staff) {
                    dsStaff.add((Staff)o);
                }else {
                    break;
                }
            }
            ois.close();
        } catch (EOFException e) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void Save() {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(var o : dsStudent) {
                oos.writeObject(o);
            }
            for(var o : dsStaff) {
                oos.writeObject(o);
            }
//			System.out.println("Save Completed");
            oos.close();	fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void addStudent() {
        Student a = new Student();
        System.out.print("Nhap ten: ");
        sc.nextLine();
        a.setName(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        a.setAddress(sc.nextLine());
        System.out.print("Nhap program: ");
        a.setProgram(sc.nextLine());
        System.out.print("Nhap year: ");
        a.setYear(sc.nextInt());
        System.out.print("Nhap Fee: ");
        a.setFee(sc.nextDouble());
        dsStudent.add(a);
    }
    public static void addStaff() {
        Staff a = new Staff();
        sc.nextLine();
        System.out.print("Nhap ten: ");
        a.setName(sc.nextLine());
//		sc.nextLine();
        System.out.print("Nhap dia chi: ");
        a.setAddress(sc.nextLine());
        System.out.print("Nhap school: ");
        a.setSchool(sc.nextLine());
        System.out.print("Nhap Pay: ");
        a.setPay(sc.nextDouble());
        dsStaff.add(a);
    }
    public static void Them() {
        System.out.println("-------------------------");
        System.out.println("1. Add Student");
        System.out.println("2. Add Staff");
        System.out.println("-------------------------");
        int n = Integer.parseInt(sc.next());
        if(n == 1) {
            addStudent();
        }else if (n == 2) {
            addStaff();
        }else {
            System.out.println("Nhap sai! Vui long nhap lai!");
            Them();
        }
    }
    public static void InDSStudent() {
        System.out.println("-----Danh Sach Student-----");
        for(var o : dsStudent) {
            System.out.println(o.toString());
        }
    }
    public static void InDSStaff() {
        System.out.println("-----Danh Sach Staff-----");
        for(var o : dsStaff) {
            System.out.println(o.toString());
        }
    }
    public static void removeStudent() {
        System.out.print("Nhap ten student muon xoa: ");
        boolean ok = false;
        sc.nextLine();
        String name = sc.nextLine();
        for(var o : dsStudent) {
            if(o.getName().equals(name)) {
                dsStudent.remove(o);
                ok = true;
            }
        }
        if(!ok) {
            System.out.println("Khong co student ten " + name);
        }
    }
    public static void removeStaff() {
        System.out.print("Nhap ten Staff muon xoa: ");
        boolean ok = false;
        sc.nextLine();
        String name = sc.nextLine();
        for(var o : dsStaff) {
            if(o.getName().equals(name)) {
                dsStudent.remove(o);
                ok = true;
            }
        }
        if(!ok) {
            System.out.println("Khong co student ten " + name);
        }
    }
    public static void Xoa() {
        System.out.println("-------------------------");
        System.out.println("1. Remove Student");
        System.out.println("2. Remove Staff");
        System.out.println("-------------------------");
        int n = Integer.parseInt(sc.next());
        if(n == 1) {
            removeStudent();
        }else if (n == 2) {
            removeStaff();
        }else {
            System.out.println("Nhap sai! Vui long nhap lai!");
            Xoa();
        }
    }
    public static void update(int i) {
        if(i==1) {
            System.out.print("Nhap ten sinh vien muon sua: ");
            sc.nextLine();
            String name = sc.nextLine();
            boolean ok = false;
            for(var o : dsStudent) {
                if(o.getName().equals(name)) {
                    ok = true;
                    dsStudent.remove(o);
                    addStudent();
                }
            }
            if(!ok) {
                System.out.println("Khong co student nao ten " + name);
            }

        }else {
            System.out.print("Nhap ten Staff muon sua: ");
            String name = sc.nextLine();
            boolean ok = false;
            for(var o : dsStaff) {
                if(o.getName().equals(name)) {
                    ok = true;
                    dsStaff.remove(o);
                    addStaff();
                }
            }
            if(!ok) {
                System.out.println("Khong co staff nao ten " + name);
            }
        }
    }
    public static void CapNhap() {
        System.out.println("-------------------------");
        System.out.println("1. Update Student");
        System.out.println("2. Update Staff");
        System.out.println("-------------------------");
        int n = Integer.parseInt(sc.next());
        if(n == 1) {
            update(1);
        }else if (n == 2) {
            update(2);
        }else {
            System.out.println("Nhap sai! Vui long nhap lai!");
            CapNhap();
        }
    }
    public static void UI() {

        while(true) {
            System.out.println("-----------------------------");
            System.out.println("0 - In danh sach");
            System.out.println("1 - Them");
            System.out.println("2 - Xoa");
            System.out.println("3 - Cap nhap");
            System.out.println("Khac: Thoat chuong trinh");
            System.out.println("-----------------------------");
            Save();
            int n = Integer.parseInt(sc.next());
            if(n==1) {
                Them();
            }else if(n==2) {
                Xoa();
            }else if(n==3){
                CapNhap();
            }
            else if(n == 0) {
                System.out.println("-----------------------------");
                System.out.println("1. Print Student");
                System.out.println("2. Print Staff");
                System.out.println("-----------------------------");
                int c = sc.nextInt();
                if(c == 1) {
                    InDSStudent();
                }else if(c ==2) {
                    InDSStaff();
                }
            }else {
                break;
            }
        }
    }
    public static void main(String[] args) {

        if(file.exists()) {
            Load();
        }
        UI();
    }





}
