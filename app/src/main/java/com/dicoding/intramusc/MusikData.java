package com.dicoding.intramusc;

import java.util.ArrayList;

public class MusikData {
    public static String[][] data = new String[][]{
            {"Angklung", "Jawa Barat", "https://upload.wikimedia.org/wikipedia/id/thumb/f/f4/Angklungalatmusikkhassunda.jpg/133px-Angklungalatmusikkhassunda.jpg", "Angklung adalah alat musik multitonal (bernada ganda) yang secara tradisional berkembang dalam masyarakat Sunda di Pulau Jawa bagian barat. Alat musik ini dibuat dari bambu, dibunyikan dengan cara digoyangkan (bunyi disebabkan oleh benturan badan pipa bambu) sehingga menghasilkan bunyi yang bergetar dalam susunan nada 2, 3, sampai 4 nada dalam setiap ukuran, baik besar maupun kecil. Dictionary of the Sunda Language karya Jonathan Rigg, yang diterbitkan pada tahun 1862 di Batavia, menuliskan bahwa angklung adalah alat musik yang terbuat dari pipa-pipa bambu, yang dipotong ujung-ujungnya, menyerupai pipa-pipa dalam suatu organ, dan diikat bersama dalam suatu bingkai, digetarkan untuk menghasilkan bunyi."},
            {"Aramba", "Sumatera Utara", "https://2.bp.blogspot.com/-Srh5wNxDchA/W7DCVgrZCFI/AAAAAAAACyE/rycEi8Gtq5oSWjDbU8vW8c9YszRhSDwGQCK4BGAYYCw/s200/aramba.jpg","Aramba Alat musik tradisional Suku Nias – Sumatera Utara. Aramba adalah salah satu alat musik yang terbuat dari tembaga, kuningan, suasa dan nikel. Alat ini dimainkan oleh satu orang. Fungsi aramba berperan sebagai pembawa pola irama. Selain aramba ada juga beberapa alat musik tradisional dari Suku Nias antara lain Gondra, doli-doli, fondrahi, lagia dan rici-rici."},
            {"Bende", "Lampung", "https://2.bp.blogspot.com/-nomBCu3XSW0/Vbrqt4sKwxI/AAAAAAAADqI/nCoieU4tcE4/s1600/brende.jpg","Bende atau canang adalah sejenis gong kecil yang dapat dijumpai di hampir seluruh kepulauan Nusantara, dari Sumatra hingga Maluku dan Papua. Pada masa lalu, bende biasanya digunakan untuk memberikan penanda kepada masyarakat untuk berkumpul di alun-alun terkait informasi dari penguasa, untuk menyertai kedatangan raja atau penguasa ke daerah tersebut, atau untuk menandai diadakannya pesta rakyat. Saat ini, bende biasanya digunakan untuk menandakan adanya keramaian seperti topeng monyet atau pesta rakyat yang lain.Bende sudah ada sejak zaman nenek moyang kita terbukti pada relief candi Sukuh pada abad ke 15 yang terlihat dengan jelas bentuk atau wujud bende tersebut."},
            {"Khendang", "Daerah Istimewa Jogjakarta", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Traditional_indonesian_drums.jpg/220px-Traditional_indonesian_drums.jpg","Kendang atau kendhang adalah instrumen dalam gamelan Jawa Tengah dan Jawa Barat yang salah satu fungsi utamanya mengatur irama. Instrument ini dibunyikan dengan tangan, tanpa alat bantu. Jenis kendang yang kecil disebut ketipung, yang menengah disebut kendang ciblon/kebar. Pasangan ketipung ada satu lagi bernama kendang gedhe biasa disebut kendang kalih. Kendang kalih dimainkan pada lagu atau gendhing yang berkarakter halus seperti ketawang, gendhing kethuk kalih, dan ladrang irama dadi. Bisa juga dimainkan cepat pada pembukaan lagu jenis lancaran ,ladrang irama tanggung. Untuk wayangan ada satu lagi kendhang yang khas yaitu kendhang kosek."},
            {"Sasando", "Nusa Tenggara Timur", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Sasando_PRJ.jpg/146px-Sasando_PRJ.jpg","Sasando adalah sebuah alat musik dawai yang dimainkan dengan dipetik. Instumen musik ini berasal dari pulau Rote, Nusa Tenggara Timur. Secara harfiah nama Sasando menurut asal katanya dalam bahasa Rote, sasandu, yang artinya alat yang bergetar atau berbunyi. Suara sasando ada miripnya dengan alat musik dawai lainnya seperti gitar, biola, kecapi, dan harpa."},
            {"Puput Serunai", "Sumatera Barat", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Shehnai.jpg/220px-Shehnai.jpg", "Setelah dikenal luas di dataran tinggi Minangkabau (kawasan Sumatra Barat sekarang), serunai menjadi populer sebagai alat musik tiup tradisional Minang. Alat musik ini dikenal merata di Sumatra Barat, terutama di bagian dataran tinggi seperti di daerah Agam, Tanah Datar dan Lima Puluh Kota, dan juga di sepanjang pesisir pantai Sumatra Barat. Alat musik ini sejak lama telah dipopulerkan ke seluruh Indonesia oleh para imigran dari Minang dan juga telah dikenal sebagai alat musik tradisional di Malaysia dan masyarakat Banjar di Kalimantan dengan nama yang sama."}
    };
    public static ArrayList<Musik> getListData(){
        Musik musik = null;
        ArrayList<Musik> list = new ArrayList<>();
        for (String[] aData : data) {
            musik = new Musik();
            musik.setName(aData[0]);
            musik.setRemarks(aData[1]);
            musik.setPhoto(aData[2]);
            musik.setDesc(aData[3]);
            list.add(musik);
        }

        return list;
    }
}
