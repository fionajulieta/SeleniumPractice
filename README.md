Module 21: Membuat Web UI automation framework dengan Selenium

Buat kerangka pengujian UI Web menggunakan Cucumber, Java, Gradle, Selenium
Untuk menyelesaikan tugas ini, Anda perlu melakukan hal berikut:
- Buat proyek Gradle dan konfigurasikan dependensi yang diperlukan seperti Cucumber, Selenium, dan JUnit.
- Terapkan pola Model Objek Halaman, di mana setiap halaman web dari aplikasi yang diuji direpresentasikan sebagai kelas Java yang terpisah.
  Kelas ini akan berisi semua pencari lokasi dan metode yang diperlukan untuk berinteraksi dengan elemen di halaman tersebut.
- Tulis kasus uji menggunakan Gherkin syntax, yang merupakan format bahasa alami untuk menggambarkan tes.
  Kasus uji harus menjelaskan perilaku yang diharapkan dari aplikasi dalam hal fitur dan persyaratannya.
- Gunakan Cucumber library untuk mendukung kasus pengujian Gherkin, menjalankannya, dan membuat laporan.
- Buat rangkaian pengujian otomatis yang mencakup tests positif (positive), negatif (negative), dan batas (boundaries).
  Pengujian ini harus memverifikasi fungsionalitas aplikasi, memeriksa apakah aplikasi berperilaku seperti yang diharapkan dalam skenario yang berbeda.
- Kirimkan tugas sebagai repositori GitHub dengan file README yang tepat yang menjelaskan tujuan proyek dan cara menjalankan pengujian.
  README juga harus menyertakan informasi yang relevan tentang penyiapan dan konfigurasi proyek.

Isi Project:
Note: Project ini menggunakan website https://www.saucedemo.com/v1/index.html
Untuk running testing pada project ini, bisa ketik diterminal --> ./gradlew cucumber
Terdapat 2 feature file dalam project ini untuk testing fitur login dan fitur add item to shopping cart:
1. Feature: Login
   - Scenario: Login with valid email and valid password
   - Scenario: Login with valid email and invalid password
   - Scenario: Login with invalid email and invalid password
   - Scenario: Login with a locked-out user account
2. Feature: Move Item From Home Inventory to Shopping Cart --> testing fungsi 'Add to Cart' pada setiap item yang ada menggunakan 2 user yang berbeda ('standard_user' dan 'problem_user')
   - Scenario: Adding item 1 to shopping cart (normal user)
   - Scenario: Adding item 2 to shopping cart (normal user)
   -  Scenario: Adding item 3 to shopping cart (normal user)
   -  Scenario: Adding item 4 to shopping cart (normal user)
   -  Scenario: Adding item 5 to shopping cart (normal user)
   -  Scenario: Adding item 6 to shopping cart (normal user)
   -  Scenario: Adding item 1 to shopping cart (problem user)
   -  Scenario: Adding item 2 to shopping cart (problem user)
   -  Scenario: Adding item 3 to shopping cart (problem user)
   -  Scenario: Adding item 4 to shopping cart (problem user)
   -  Scenario: Adding item 5 to shopping cart (problem user)
   -  Scenario: Adding item 6 to shopping cart (problem user)

Dari scenario-scenario yg ada, ada ditemukan 3 error pada fitur "Move Item From Home Inventory to Shopping Cart", sebagai berikut:
![image](https://github.com/fionajulieta/SeleniumPractice/assets/146444371/02424c58-f582-4b4d-b119-1ba6b2214bc8)


