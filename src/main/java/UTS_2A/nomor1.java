package UTS_2A;


public class nomor1 {
    public static void printData(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
        public static void insertionSort(int[] data){
        for (int i=1; i<data.length; i++){
            int key = data[i];
            int j = i-1;
            while((j>=0)&&(data[j]>key)){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
    }
        public static void tampil(int data[]){
        for (int i=0; i< data.length; i++){
            System.out.print(data [i]+ " ");
        }
        System.out.println();
    }
   public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("indeks pointer = "+middle);
            if (key == data[middle]){
                System.out.println("data "+key+" Telah ditemukan pada indeks ke "+middle);
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println("cari di kiri");
                    indexAkhir = middle-1;
                }
                else{
                    System.out.println("cari di kanan");
                    indexAwal = middle+1;
                }
            }
        }
        if (found == 1){
            System.out.println("kesimpulan : data telah ditemukan");
        }
        else{
            System.out.println("kesimpulan : data tidak ditemukan");
        }
   }
   public static void main(String[] args) {
        
        int[] nilai = {3,10,4,2,8,13};
        printData(nilai);
        insertionSort(nilai);
        System.out.println();
        printData(nilai);
        System.out.println();
        int key = 8;
        
        binarySearch(nilai, key);
    }   
}
