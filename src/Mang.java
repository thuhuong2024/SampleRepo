//- Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
//- Tạo mảng để lưu những số chẵn đó vào
//- Duyệt mảng để in ra kết quả sau khi nạp vào

public class Mang {
    public static void main(String[] args) {
        // Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
        }

        System.out.println("________Câu 2____________");

        // Tạo mảng để lưu nhưng số chẵn đó vào
        int number[] = new int[26];
        int index = 0;
        for (int i = 0; i <= 50; i += 2) {
            number[index] = i;
            index++;
        }

        System.out.println("___________Câu 3_________");

        //Duyệt mảng để in ra các kết quả đó
        for (int j = 0; j < number.length; j++) {
            System.out.println(number[j]);

        }
    }
}
