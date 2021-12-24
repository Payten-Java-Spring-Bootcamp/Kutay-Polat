----CEVAPLAR----
1) “Pass by Value” yaklaşımı uygulandığında, metotun içine aldığı parametrenin değeri, belleğin başka bir yerine kopyalanır. Şayet metodun değişkenine erişmek veyahut bu değişkeni değiştirmek isterseniz, yalnızca kopyaya erişilir/değiştirilir, orijinal değere dokunulmaz. Pass by Reference Referans ile geçirme, değişkenin hafıza adresinin ilgili metoda iletildiği anlamına gelir. Yani hafızada ilgili değişkenin değerini saklayan bloğun adresi, metoda geçirilir.
2) immutable (değişmez), nesneler bir kez oluşturulduktan sonra içeriği değiştirilemeyen sınıflardır. Tam tersi olarak, değiştirilebilen sınıflar da Mutable (değişebilir) sınıflardır. Kısacası Immutable nesneler değişmeyen nesnelerdir. Onları oluşturursun, fakat onları değiştiremezsin. Bunun yerine, değişmez bir nesneyi değiştirmek isterseniz, onu klonlamanız ve oluştururken klonu değiştirmeniz gerekir. Immutable nesneler, çok iş parçacıklı(multi-threaded) ortamlarda ve streamlerde kullanışlıdır. Değişmeyen nesnelere güvenmek harikadır. Başka bir thread’in nesnesini değiştiren bir iş parçacığının neden olduğu hatalar olabilir. Immutable nesneler, bu sorunların tümünü çözmüş olacaktır.
Java’da değişmez sınıf yapmak için aşağıdaki adımları uygulamanız gerekir.Sınıfı, final anahtarı ile işaretlemek gerekir, böylece genişletilemez (extend edilemez).Sınıfın tüm alanlarını private yapın, böylece doğrudan erişime izin verilmez.
Değişkenler için setter yöntemleri sağlamayın.Tüm değiştirilebilen alanları final yapın, böylece yalnızca bir kez atanabilir.
Tüm alanların, contructor aracılığıyla ilk değerlerini atamasını sağlar.Değiştirebilir olan tüm alanların dışarıya nesnelerin klonlanarak dönmesini gerçekleştirin.

3) Library ile Framework ‘ün ayrıştığı nokta teknik kısımdır. İki arasındaki temel teknik fark, kodun nasıl çağrıldığıdır. Library kullanırken, library size bazı özellikler vererek kullanmanızı sağlar, bu şekilde almış olduğunuzu kodu kendi sisteminize uygularken size kodu nerede ve ne zaman kullanacağınıza karışmaz veya bir diğer deyişle dikte etmez. Framework ise Library'in tersine kullanacağız özelliğe göre kodu nerede ve ne zaman kullanacağınız söyler, kullanacağız bu işlev, eğer Framework dokümanın belirtildiği gibi kullanılmaz ise kullanım dışı kalır.

4) Garbage Collection, otomatik bellek yönetimi mekanizmasıdır. Bu işlem heap belleğe bakıp, kullanılan objelerin tespit edilmesi ve referans edilmeyenlerin silinmesi üzerine kuruludur. Kullanılmayan/referans edilmeyen nesnelerin kapladığı alan bellekte boşa çıkarılır ve bellekte boş yer açılmış olur

5) “Memory leak”, programın kullandığı hafıza ile işi bittiği halde ilgili hafıza bloğunu serbest bırakmaması durumudur. Bu durum, Gerçekte kullanılmayan hafıza bloklarının referans edilmeye devam edilmesinden veya Native resource’ların düzgün bir şekilde serbest bırakılmamasından. Java’da memory leak oluşması mümkündür, kaçınmak için ;
İlk olarak, static kullanımımıza çok dikkat etmemiz gerekiyor; herhangi bir koleksiyonu veya ağır nesneyi statik olarak bildirmek, yaşam döngüsünü JVM'nin yaşam döngüsüne bağlar ve tüm nesne grafiğinin toplanmasını imkansız hale getirir. Ayrıca genel olarak koleksiyonların farkında olmamız gerekir - bu, istemeden referansları ihtiyacımız olandan daha uzun süre tutmanın yaygın bir yoludur.

6) 6 ayda bir – mart ve eylül aylarında.
7) Stack ve Heap bellekte (RAM’de) bulunan mantıksal yapılardır. Değer tip (value type) dediğimiz int, short, byte, long, decimal, double, float gibi tipler stackte tutulur. Stackte veriler üst üste (LIFO– Last in First out) mantığında dizilir ve sırası gelmeden aradaki bir değer ile işlem yapılamaz. Class type (Sınıf tipi) değişkenler referans tiplerdir referans ettikleri model (referans) stackte değerleri ise heapde saklanır. Değer tipler veriyi tutan değişken türleridir. Referans tipler ise veri yerine verinin bellekteki adresini tutan değişken türleridir. (Referans tiplere string, array, interface, class, pointer’ı örnek olarak vermek mümkün.)

8) OpenJDK ve Oracle JDK arasındaki en büyük fark lisanslamadır. OpenJDK, GNU Genel Kamu Lisansına sahip tamamen açık kaynaklı Java'dır. Oracle JDK, Oracle İkili Kod Lisans Sözleşmesi kapsamında bir ticari lisans gerektirir. Ancak destek ve maliyet açısından da birçok farklılık vardır.

9) Java 8 ile gelen ve içerisinde yalnızca bir adet abstact metod barındıran interface’lerdir. Eğer interface’imiz içerisinde yalnızca tek bir metod bulunuyor ve bu metodda abstract ise o zaman buna Functional Interface diyebiliriz. Ancak içeriisnde default metod barındırması bizler için sorun teşkil etmemekte. Kısaca tekrar tanım yapacak olursak içerisinde sadece ve sadece 1 adet abstract metod ve istediği kadar default metod barındıran interface’lere biz Functional Interface diyoruz. Functional Interface’ler Lamda kullanımı sağlamak amacıyla da tanımlanmaktadır. Bu interface’lerimizi tanımlarken @FunctionalInterface olarak belirtmemiz gerekmekte. Ancak belirtmesek dahi Java ile  kullanım sağlayabiliriz.

10) fazlasıyla Functional Interface var, başlıca ;

java.awt.KeyEventDispatcher
java.awt.KeyEventPostProcessor
java.io.FileFilter
java.io.FilnameFilter
java.lang.Runnable
java.lang.Thread.UncaughtExceptionHandler
java.nio.file.DirectoryStream.Filter
java.nio.file.PathMatcher
java.time.temporal.TemporalAdjuster
java.time.temporal.TemporalQuery
java.util.Comparator
java.util.concurrent.Callable
java.util.logging.Filter
java.util.prefs.PreferenceChangeListener

