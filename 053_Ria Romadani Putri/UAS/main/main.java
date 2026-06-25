import controller.MainController;
import service.AkademikService;
import view.KonsolView;

public class Main {
    public static void main(String[] args) {
        try {
            // Memanggil implementasi service via reflection agar aman dari batasan package-private
            Class implClass = Class.forName("service.AkademikServiceImpl");
            AkademikService service = (AkademikService) implClass.getDeclaredConstructor().newInstance();
            
            // Hubungkan Service ke Controller
            MainController controller = new MainController(service);
            
            // Mengisi data tiruan (dummy data) di awal program
            controller.daftarMahasiswaBaru("Farel Arfiandra", "250631100059");
            controller.daftarMahasiswaBaru("Ria Romadani Putri", "250631100053");
            
            // Hubungkan Controller ke View lalu jalankan
            KonsolView view = new KonsolView(controller);
            view.bukaMenu();
            
        } catch (Exception e) {
            System.out.println("Gagal menjalankan aplikasi Sistem Akademik: " + e.getMessage());
            e.printStackTrace();
        }
    }
}