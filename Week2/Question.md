1-) Spring dışında dependency injection için kullanabileceğimiz framework’ler / kütüphaneler nelerdir ?
(Herhangi bir programlama dili için olabilir.)

Örnek olarak ;
-Google Guice (Java)
-Dagger (Java and Android)
-Castle Windsor (.NET)
-Unity(.NET)

2-)@SpringBootApplication anotasyonu hangi anotasyonları kapsamaktadır ? Görevlerini kısaca açıklayınız

A2-Spring boot projesi oluşturulurken @SpringBootApplication anotasyonu application classa uygulanır.
3 anotasyonu içerir.Bunlar @EnableAutoConfiguration,@ComponentScan ve @Configurationdur.
@SpringBootApplication en üst package da yer almalıdır yoksa @componentscan sadece alt packageları izleyebileceği için üst packageları izleyemez.
@Configuration: Bean tanımlanan classlara uygulanan bir anotasyondur.@Configuration bir Xml yapılandırma dosyasına benzer davranan java <sınıfıdır.@Configuration> anotasyonu ile işaretlenmiş java sınıfı,
bağımlılıkları başlatma ve yapılandırma yöntemleri de dahil olan bir yapılandırmadır.
@EnableAutoConfiguration: Main application classında daha çok bu anotasyon bulunur.Class da bulunan beani configure eder.
@ComponentScan: Bean için bir package ararken @Configuration anotasyonu ile kullanılır.
Spring components için aranacak temel packageları da belirtebiliriz.

3-)@Primary, @Qualifier anotasyonlarının kullanım amaçlarını açıklayınız. 
@Primary: Tanımladığımız constructorları çağırdığımızda birisinin default gelmesini istiyorsak @Primary anotasyonunu kullanırız.
@Qualifier:Eğer beanimize değer atamak istiyorsak spring bu tanımlamalardan hangisinin kullanılacağına @Qualifier anotasyonu ile karar verir.

4-) Convention over configuration kavramını seçtiğiniz bir örnek üzerinden açıklayınız.
Yazılım çerçeveleri tarafından kullanılan bir yazılım tasarım paradigmasıdır
çerçeveyi kullanan bir geliştiricinin aldığı kararların sayısını azaltmaya çalışan
Esnekliği kaybetmeden yapmanız gerekir ve kendinizi tekrar etmeyin (DRY)
prensipler.
Örnek olarak Maven, Konfigürasyon Üzerinden Konvansiyon kullanır, bu da geliştiricilerin olmadığı anlamına gelir.
inşa sürecini kendileri oluşturmak için gerekli. Geliştiricilerin her birinden bahsetmesi gerekmez ve
her yapılandırma detayı. Maven, projeler için mantıklı varsayılan davranış sağlar. Zaman
Maven projesi oluşturulur, Maven varsayılan proje yapısını oluşturur.

5-)Aspect Oriented Programlama nedir ? Avantajları ve dezavantajları nelerdir ?

AOP, yazılımın karmaşıklığını azaltmaya, modülariteyi artırmaya yarayan bir yaklaşım
biçimidir. Buradaki modülariteden kasıt uygulama süresince sistemin birçok bölümünde
kullanılan, fonksiyonel olmayan kodun yani kesişen ilgilerin ufak ufak parçalara ayrılmasıdır
(Seperation of Cross Cutting Concerns). Bu sayede uygulama genelinde kullanılacak olan
yapıları, sistemden soyutlamış olup enkapsüle de ederek birçok yerde kullanılmasını sağlar.
Genel olarak AOP bir sorunu çözmektense var olan sistemin daha güzel bir hale getirilmesini
de sağlamaya yardımcı olur denilebilir. 
-İçi içe yazılı tekrar edenler kod bloklarından kurtarır.
-Temiz ve anlaşılır kod sağlar. 
-Yazmış olduğumuz kodları daha abstract hale getirerek modülerliğini arttırır.
-Bakım ve geliştirme maliyetlerini azaltır.

6-)SOLID prensiplerini kısaca açıklayınız. Sizce her koşulda bu prensipler çerçevesinde mi kod yazılmalıdır ? Neden ?

S — Single-responsibility principle
ÖZET: Bir sınıf (nesne) yalnızca bir amaç uğruna değiştirilebilir, o da o sınıfa yüklenen sorumluluktur, yani bir sınıfın(fonksiyona da indirgenebilir) yapması gereken yalnızca bir işi olması gerekir.
O — Open-closed principle
ÖZET: Bir sınıf ya da fonksiyon halihazırda var olan özellikleri korumalı ve değişikliğe izin vermemelidir. Yani davranışını değiştirmiyor olmalı ve yeni özellikler kazanabiliyor olmalıdır.
L — Liskov substitution principle
ÖZET: Kodlarımızda herhangi bir değişiklik yapmaya gerek duymadan alt sınıfları, türedikleri(üst) sınıfların yerine kullanabilmeliyiz.
I — Interface segregation principle
ÖZET: Sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturmalıyız.
D — Dependency Inversion Principle
ÖZET: Sınıflar arası bağımlılıklar olabildiğince az olmalıdır özellikle üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.
Her bir prensibi ihlal eden ve doğru olan örnekleriyle birlikte detaylı olarak açıklayacağım bir yazı dizisi olacaktır. Burada hem uygulama yanlışlarını hem de dogru uygulanışını görerek daha iyi anlama ve teknik anlamda kolayca uygulanabilmesi amaçlanmıştır. S.O.L.I.D. temel olarak her yazılımcının öğrenmesi ve yazılım hayatı boyunca uygulanması gereken önemli prensipler bütünüdür.

7-)Swagger nedir, ne amaçla kullanılmaktadır ?

Swagger Rest API geliştirmek için gerekli bir sözleşme standardı ve bu çerçevede işlev gören yardımcı araçlar sunan bir teknolojidir. Swagger sunduğu standart ve araçlarla API tasarım, geliştirme, dokümantasyon ve test aşamasında kolaylık sağlamaktadır.

Haberleşmenin en önemli aşaması sözleşmedir. Örneğin biz aramızda haberleşmek için Türkçe sözleşmesinden faydalanıyoruz. Kuralları belli. Değil Türkçe dumanla haberleşmenin bile bir sözleşmesi ve kalıbı var.

8-)Richardson Maturity Model’i seviyeleriyle birlikte açıklayınız.

Richardson Maturity Model Rest API’lerimizin hangi seviyede olgun olduğunu gösteren bir olgunluk seviyesidir.
RMM 4 seviyeden oluşmaktadır ve 0’dan 3’e başlayan seviyeler, yukarı doğru çıktıkca daha etkin kullanıldığını ifade etmektedir.

Level 0: Swamp of POX
Servisimizdeki sadece tek metod üzerinden POST olarak erişebildiğimiz seviyedir. Bu seviye transfer protokolü olarak da adlandırılmaktadır.

Level 1: Resources
Servimizdeki URI üzerinden bir metot üzerinden erişilebildiğimiz seviyedir. Örnek URI http://localhost/students/1

Level 2: HTTP verbs
POST, PUT, GET ve DELETE metotları çağırdığımız seviyedir.

Level 3: Hypermedia controls
Servislerimizde URI’nin istek gönderip cevaba göre tekrar URI’ye istek yapabildiğimiz bir seviyedir. Servis üzerinden gelen cevaba göre akıştaki davranışı görebiliriz. HATEOAS kullandığımız seviyedir.

9-)URL, URI, URN kavramlarını bir örnek üzerinden açıklayınız.

URI (Uniform Resource Identifier)
URI (Uniform Resource Identifier), kaynağa tam olarak tanımlayıcı (identifier) ile işaret eden (belge, resim, dosya vb.) ve bu işaretleme için standart bir formata sahip karakter dizgisidir. URL kapsamında tutulan alt tanımlardır. Bir sayfa, görsel, dosya vb. URI için örnek olabilir; http://ornekwebsitesi.com/logo.png, ISBN 0-486-27557-4 gibi. URI, URL ve URN olarak 2 kapsama sahiptir. Hem URN’ler (adlar) hem de URL’ler (konumlayıcılar) URI’lardır ve belirli bir URI aynı anda hem bir isim hem de konumlandırıcı olabilir.

URL (Uniform Resource Locator)
URL (Uniform Resource Locator), Tekdüzen Kaynak Bulucu ya da Kaynak Konumlayıcı şeklinde ifade edilebilir. İnternet aracılığıyla erişişebilecek kaynakların (dosyalar, dökümanlar vb.) konumu URL ile ifade edilir. URL teknik olarak URI’nın başlangıç kısmını oluşturur. Yapısal olarak, URL’in ardından ise URN gelmektedir. Ancak, bir konum belirtilmek istendiğinde çoğu durumda URI yerine URL ifadesi kullanılmaktadır. URI sözdizimi (syntax) şöyledir:

scheme://domain:port/path?query_string#fragment_id
scheme://user:password@host:port/path?query_string#fragment_id
Bir kaynağın nerede olduğunu ve ona nasıl ulaşılacağını belirleyen URL http://, ftp:// gibi pek çok protokolü barındırabilir. URL ve URI ilişkisini bir adres tarifi üzerinden gerçekleştirdiğimizde, URL konumu nitelerken, URN konumdaki kişinin adına benzer. Özetle, URL bir konum sağlarken URN bir şeyin kimliğini ifade eder. Örneğin, telnet://192.0.2.16:80/ bir URL iken tel:+1-816-555-1212 bir URN’dir.

URN (Uniform Resource Name)
Bir kaynağı benzersiz ve kalıcı bir adla tanımlar, ancak bunu İnternet’te nasıl bulunacağının söylenmesi gerekmez. Belgeleri tanımlamakla sınırlı değildirler. Hatta, URN’ler fikirleri ve kavramları tanımlayabilir. Bir URN genelde urn: prefix’i ile başlar.

urn:isbn:0451450523 ISBN ile bir kitabı işaret eder.
urn:uuid:6e8bc430-9c3a-11d9-9669-0800200c9a66 global olarak benzersiz bir tanımdır.
urn:publishing:book bir belgeyi kitap türü olarak tanımlayan bir XML ad alanıdır.

10-)Idempotency nedir ? Hangi HTTP metotları idempotent’ tir ?

Bir metodun bir defa çağrıldığında alınan sonuç ile birden fazla kez çağrıldığında alınan sonuç aynı ise bu bir idempotent metottur.
Bunu örnek vererek açıklayalım;
public void a(){
i = 50;
}
public void b(){
i = i + 1;
}
“a” metodu bir kez çağrıldığında “i” değişkeninin değeri 50 olacaktır. Biz kez daha çağrıldığında sonuç değişmeyecektir.
“b” metodu bir kez çağrıldığında “i” değişkeninin değeri kaç ise bir fazlası olacaktır. Örneğin “i” nin ilk değeri 20 ise ilk kez çağırdığımızda değeri 21 olacaktır. Bir kez daha çağırırsak “i” nin değeri 22 olacaktır.
Bu durumda “a” metodu idempotent, “b” metodu ise non-idempotent metottur.
Birde bu durumu HTTP metotları özelinde inceleyelim.
HTTP metotları
GET, POST, PUT ve DELETE metotlarıdır. Bunların dışında başka metotlarda vardır. Fakat biz sadece en bilinenler metotlar üzerinde duracağız.
Örnek olarak veritabanımızda aşağıdaki üç kayıt olsun.
‘id’:’1’, ‘name’:’Metin’, ‘surname’:’Alnıaçık’
‘id’:’2’, ‘name’:’Yusuf’, ‘surname’:’Alnıaçık’
‘id’:’3’, ‘name’:’Dilek’, ‘surname’:’Alnıaçık’
GET
Sunucuya /students/1 şeklinde bir istek gönderdiğimizde, id si 1 olan kayıt dönecektir. Bu isteği birden fazla kez tekrarlamamız sonucu değiştirmeyecektir. Bundan dolayı GET idempotenent bir metottur.
PUT
/students/1
body: {‘name’:’Ahmet’, ‘surname’:’Acar’}
Sunucuya yukarıdaki gibi bir istek gönderdiğimizde Metin Alnıaçık ifadesi Ahmet Acar olarak güncellenecektir. İsteği bir kez daha gönderdiğimizde veritabanındaki değer Ahmet Acar olduğunda bir değişiklik olmayacaktır. Bu da idempotenent bir metottur.
DELETE
/students/1
Sunucuya yukarıdaki gibi bir istek gönderdiğimizde id si 1 olan kayıt silinecektir. İlgili istediği tekrar çağırdığımızda id si 1 olan bir kayıt olmadığından herhangi bir işlem gerçekleşmeyecektir. Bu da idempotenent bir metottur.
POST
/students
body: {‘name’:’Mehmet’, ‘surname’:’Demirci’}
Sunucuya yukarıdaki gibi bir istek gönderdiğimizde, {‘id’:’4’, ‘name’:’Mehmet’, ‘surname’:’Demirci’} şeklinde bir kayıt oluşacaktır. İlgili isteği bir kez daha çağırırsak {‘id’:’5’, ‘name’:’Mehmet’, ‘surname’:’Demirci’} şeklinde bir kayıt daha oluşacaktır. Yani kaç defa çağırırsak o kadar yeni kayıt oluşacaktır. Bundan dolayı POST non-idempotenent bir metottur.
GET İsteklerinin Sonuçlarının Cache lenmesi
Bir GET isteği gönderdiğinizde sunucu ilgili sonucu cache ler. Daha sonra aynı GET isteği geldiğinde cache yapılmış sonucu döner.
Son olarak, web tarayıcıları üzerinde yenile işlemi yapıldığında, sayfa yüklenmeden önce eğer ilgili metot non-idempotent ise ilgili istek daha önce gönderildi mesajı verir ve metodu tekrar çalıştırmak için bizden onay ister. Bu onay mekanizması bizi non-idempotent metotların bizim kontrolümüz dışında birden fazla kez çalışmasını önler.

11-)RFC (Request For Comment) neyi ifade etmektedir ? HTTP hangi RFC dokümanında açıklanmıştır ? Bu dokümanda HTTP hakkında
   ne tür bilgiler yer almaktadır

RFC internet standartları ve protokolleri için teknik yayınlar diyebiliriz. 
Bu standartlar belirlendikten sonra üzerine teknolojiler geliştirildiği için değişmesi mümkün olmayan yeni talepler sonrasında yeni versiyonları çıkan dökümanlardır.
Bir kaç örnek ;
RFC2616: (HTTP) Hypertext Transfer Protocol — HTTP/1.1
RFC1034: (DNS) Domain Names
RFC791: (IP) Internet Protocol
RFC821 : (SMTP) Simple Mail Transfer Protocol
RFC6749: The OAuth 2.0 Authorization Framework
ve tüm RFC indeksine bu adresten ulaşabilirsiniz.
IETF (Internet Engineering Task Force) ‘de bu RFC sürecini yöneten ekibe verilen isim.
