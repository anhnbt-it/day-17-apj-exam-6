import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/27/2020
 * Time: 2:49 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        do {
            System.out.println("===========================\n" +
                    "Chương trình quản lý cán bộ\n" +
                    "===========================\n" +
                    "1. Thêm mới cán bộ\n" +
                    "2. Tìm kiếm cán bộ theo tên\n" +
                    "3. Hiển thị tất cả cán bộ\n" +
                    "---------------------------\n" +
                    "Nhập lựa chọn [0-Thoát]: ");
            System.out.print("> ");
            try {
                int choice = input.nextInt();
                input.nextLine();
                CanBo canBo = null;
                switch (choice) {
                    case 1:
                        System.out.print("Nhập họ tên: ");
                        String name = input.nextLine();
                        System.out.print("Nhập ngày sinh: ");
                        int day = input.nextInt();
                        System.out.print("Nhập tháng sinh: ");
                        int month = input.nextInt();
                        System.out.print("Nhập năm sinh: ");
                        int year = input.nextInt();
                        Date dateOfBirth = strToDate(day, month, year);
                        System.out.print("Nhập giới tính [true = Nam, false = Nữ]: ");
                        boolean gender = input.nextBoolean();
                        input.nextLine();
                        System.out.print("Địa chỉ: ");
                        String address = input.nextLine();
                        System.out.println("Cán bộ là: 1. Công nhân\t2. Kỹ sư\t3. Nhân viên");
                        System.out.print("Nhập lựa chọn [1, 2, 3]: ");
                        int canBoChoice = input.nextInt();
                        input.nextLine();
                        switch (canBoChoice) {
                            case 1:
                                System.out.print("Nhập bậc [3/7, bậc 4/7...]: ");
                                String level = input.nextLine();
                                canBo = new CongNhan(level, name, dateOfBirth, gender, address);
                                break;
                            case 2:
                                System.out.print("Nhập ngành đào tạo: ");
                                String industry = input.nextLine();
                                canBo = new KySu(industry, name, dateOfBirth, gender, address);
                                break;
                            case 3:
                                System.out.print("Nhập công việc: ");
                                String job = input.nextLine();
                                canBo = new NhanVien(job, name, dateOfBirth, gender, address);
                                break;
                            case 0:
                                System.exit(0);
                            default:
                                throw new UnsupportedOperationException("Lựa chọn sai!");
                        }
                        qlcb.add(canBo);
                        System.out.println("Success.");
                        break;
                    case 2:
                        System.out.print("Nhập tên cán bộ cần tìm: ");
                        String search = input.nextLine();
                        if (qlcb.searchByName(search) != null) {
                            System.out.println("Tìm thấy: " + search);
                            System.out.println(qlcb.searchByName(search).toString());
                        } else {
                            System.out.println();
                            System.out.println("Không tìm thấy kết quả nào.");
                        }
                        break;
                    case 3:
                        if (qlcb.size() > 0) {
                            qlcb.show();
                        } else {
                            System.out.println();
                            System.out.println("Không có dữ liệu...");
                        }
                        break;
                    case 0:
                        System.out.println();
                        System.out.println("Thoát...");
                        System.exit(0);
                    default:
                        System.out.println();
                        System.out.println("Lựa chọn không đúng!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Định dạng nhập vào không đúng!");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public static Date strToDate(int day, int month, int year) throws ParseException {
        String dateStr = day + "/" + month + "/" + year;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
        return format.parse(dateStr);
    }
}
