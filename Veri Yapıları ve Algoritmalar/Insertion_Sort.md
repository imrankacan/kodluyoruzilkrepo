
https://app.patika.dev/imrankacan

## Sorular

[22,27,16,2,18,6] -> Insertion Sort

1- Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
2- Big-O gösterimini yazınız.
####Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
3- Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.


4- [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.


## Çözümler

1- İlk sıradaki değer en küçük değer bulunarak yer değişimi yapılır. İkinci ve üçüncü değerler içinde aynı işlemler sıralı olarak gerçekleştirilir.

    [2,6,16,22,18,27]
==> [2,6,16,22,18,27]
==> [2,6,16,18,22,27]

2- (n^2+n) => O(n^2)

3- Average case kapsamına girer.

4-   [7,3,5,8,2,9,4,15,6]
==>  [2,3,5,8,7,9,4,15,6]
==>  [2,3,4,8,7,9,5,15,6]
==>  [2,3,4,5,7,9,8,15,6]
==>  [2,3,4,5,6,9,8,15,7]


