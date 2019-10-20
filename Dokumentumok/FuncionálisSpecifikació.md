# GameOver: Funkcionális Specifikáció

### I.Hogyan állunk jelenleg?

Jelenleg a felhasználók rendelkezésére áll rengeteg lehetőség, amennyiben
számítógépes játékot keresnek szabadidejük eltöltésére. A [Microsoft Store](https://www.microsoft.com/en-us/store/b/home)-ban
elérhető, egy bizonyos [The Games Database](https://www.microsoft.com/en-us/p/the-games-database/9nblggh6jhl9?activetab=pivot:overviewtab),   valamint elérhető számos weboldal az interneten, ahol hasonló tartalmak
érhetőek el. Azonban ezeknek egyike se lenne fogható az általunk elképzelt
szoftverhez, sokkal nagyobb és frissebb adatbázist szeretnénk a felhasználóknak
biztosítani, sokkal szabadabb és rugalmasabb keresést, ajánlásokat tenni nekik.
A jelenleg elérhető ilyen programok nagyrésze pedig online, az interneten
található. Valamint a jelnleg elérhető alternatívák közül egyik sem kínálja
a játékok értékelésének, esetleg későbbre történő elmentésük lehetőségét.
Nem biztosítják ügyfeleik számára a privát teret, azaz nincs bejelentkezés,
nincsenek személyre szabott ajánlások sem a böngészés tekintetébe. Ezért
van szükség egy olyan alkalmazásra, amellyel a felhasználó személyes
érdeklődési körének megfelelően kereshet játékokat, valamint a szoftver is
ajánl neki ilyeneket.

### II. A felhasználók álma

Ami az elsődleges és a legfontosabb az az, hogy mindenki számára elérhető legyen. Emiatt és egyébként is nagyon nehéz megfelelni a felhasználók elvárásainak. Főleg, ha ilyen széles réteg felé nyitunk. Elengedhetetlen, hogy a felhasználóink saját profilt készíthessenek maguknak. Emiatt szükségünk van a regisztrációra. Amihez csak a szükségek adatokat kérjük be, megkímélve a felhasználókat sok felesleges információ megadásától. Persze opcionálisan lesz erre lehetőség és a későbbiekben minden módosítható. A jelszó természetesen még bejelentkezés előtt módosítható lesz, ha netalántán valaki elfelejtené. A bejelentkező felület megalkotásánál is törekedni kell az egyszerűségre és a gyorsaságra. Ahogy nyilvánvalóan az egész program futása során fontos szempontot jelent számunkra. Mivel célul tűztük ki azt, hogy széles körben használatos szoftvert készítsünk, ezért meg kell engednünk a vendég felhasználóként való belépést is. Ha valaki bármilyen okból kifolyólag nem szeretne regisztrálni. Ez persze számos hátránnyal, illetve korlátozással jár (nem tud a felhasználó kommentelni, értékelni..). Illetve mivel így nem tudjuk tárolni az adatait, minden egyes látogatásnál új felhasználóként van értelmezve, emiatt az ajánlások sem működhetnek. Az ajánlások nagyon fontos részét képzik a leendő programunknak. Ami azt jelenti, hogy előkelő helyet fog kapni a főképernyőn a bejelentkezés után. Naponta 3 különböző ajánlatot fogunk közzétenni a felhasználóknak. Ezek a lehetőségek szerint minél jobban próbálják majd kitalálni mindegy egyes felhasználó vágyait. Azonban ha ez mégsem sikerül valamilyen ok miatt, akkor lehet őket mellőzni is. Ha viszont tetszik, akkor minden további nélkül megtekinthetőek lesznek a további részletek az adott játékról. Ezen kívül a főoldal fontos eleme kell, hogy legyen a böngészés, illetve a keresés funkciója is. A keresési kulcsszavak lehető legszélesebb skáláját fogjuk nyújtani a felhasználóknak. Lehet majd keresni címre, kiadóra, témára, de akár megjelenési dátumra is (plusz amire igény merül fel a későbbiekben). Mindemelett ami talán a leginkább fontos a programunkban, az a játékok adatlapja. Hiszen ez alkotja úgymond a gerincet. Itt fel lesz tüntetve a cím, a borító, a megjelenés dátuma, a kiadó, a platformok, egy rövid kedvcsináló leírás, linkelve az előzetes, az ár. A felhasználók értékelhetik az adott játékot egy egytől ötig terjedő skálán, csillagozós rendszerben. Lehetőségük lesz kommentelni, megosztani a saját véleményüket. Illetve a ma népszerű social oldalakra való megosztásra és természetesen elmenthetik őket kivánságlistára vagy későbbi megtekintésre. Ami szintén vágyálom cél, az az, hogy a felhasználók új játékokat is be tudjak vinni a rendzserbe, ha az valmiért nem szerepelne még az adatbázisban. Ez persze moderálás után kerülne be, ha azt válósnak vagy megfelelőnek találtuk. Lényeges számunkra, hogy a felhasználók a legnagyobb biztonságban tudják majd a saját adataikat. Ezért a jelszavakat titkosítva szeretnénk tárolni, illetve semmilyen egyéb adat sem lesz felhasználva semmilyen egyéb célra sem. Megfelelve ezzel minden mai elvárásnak. Ami a felhasználói felületet illeti, szintén törekedni szeretnénk a jelen elvárások kielégítésére. Épp ezért kell intuitívnak és minimalistának lennie. A felhasználó minél könyedebben tudjon navigálni. Egyszerű, kényelmes és gördülékeny futást szeretnénk megvalósítani. Minél szebb és letisztultabb környezetet adva, hogy öröm legyen a használata és ne szenvedés. Természetesen a program elkészülését követően semmiképp sem szeretnénk a saját sorsára hagyni. Folyamatos fejlesztéseket és javításokat fogunk alkalmazni a továbbiakban is. És új funkciók bevezetését szintén tervezzük. Amiben nagyon fontosak a felhasználók visszajelzései, ezért ezekre különösen figyelni fogunk, illetve lehetőséget biztosítani a feedbackre. Szintén szerepel a jövőbeli terveink között, hogy később az alkalmazás felkerüljön az internetre és egy bárki számára bármikor elérhető online szolgáltatás legyen belőle.

### III. Befolyásoló tényezők

### IV. Látványterv

A programablak neve: Game Over. A program sikeres indítása után a bejelentkező 
képernyő fog megjelenni. A bejelentekző képernyőnek a felső részének a középénél
lehet majd látni magának az alkalmazásnak a nevét kiírva, tehát a Game Over vagy
pedig az alkalmazásnak megfelelő szöveg fog látszani. A szöveghez képest lennébb 
tudja majd a felhasználó megadni a bejelentkezési adatait (Felhasználó név - Text Area,
Jelszó - Text Area). Az ablak bal alsó részétől kicsit bennébb kezdve lehet majd látni
a Regisztráció és a Bejelentkezés feliratú gombokat, illetve ugyan ezen a szinten
jobb oldalt lesz a vendégként történő bejelentkezés gombja, Vendég vagy Vendég vagyok
felirattal. Amennyiben a felhasználó bejelentkezéssel lépett be, úgy az adott felhasználó
által kedvelt témájú játékok címei (3 db) jelenik meg ajánlásként. Annak az eldöntésére, hogy
az ajánlott játék tetszik-e a felhasználónak, erre gombok állnak a rendelkezésére középen alul
egymás mellett: Megnézem később, Kipróbálom/Tetszett és az hogy Nem tetszett. Miután 
megfelelően jelezte a felhasználó, hogy mit szeretne tenni az ajánlott játékokkal, 
az alkalmazás fő ablaka megjelenik. Egy Menü feliratú menüvel tud majd a felhasználó
navigálni a további lehetőségei közül például: Új játék hozzáadása, Kilépés. A keresési
lehetőség középen felül lesz és mellette egy Keresés feliratú gomb van ami elindítja
a keresést. Megfelelő találat után a keresési lehetőseg alatt megjelennek/megjelenik a játék(ok).
Ha a felhasználó valamelyik keresettre rákattint akkor további, bővebb információ jelenik meg
róla. Ezen a felületen balul egy borítókép látszódik a játékról és a kép jobboldalán 
jelennek meg az információk. Ugyan ezen a felületen alul van lehetőség az értékeléshez
például egy egytől tizes skáláig. Lehetőseg is lehet a játékosnak, hogy megtekintse az
adott játéknak az előzetesét egy Előzetes megtekintése feliratú gombbal. 
Jobb alul egy gomb biztosítja a visszalépést további játékok kereséséhez Vissza felirattal.
Mindig amikor egy gombot használ a felhasználó akkor megváltozik a gomb háttere.



### V. A program futása

A program indulásakor lehetőséget kívánunk biztosítani a felhasználónak
vendégként történő belépésre vagy bejelentkezésre. Bejelentkezés esetén
a 3 darab játék jelenik meg az ügyfélnek, amelyeket az alapján válogat 
össze a szoftver, mely témájú játékokra kattintott a legtöbbször eddig.
Itt eldöntheti, hogy érdekli-e valamelyik. Amennyiben van ilyen a felsoroltak
között, azt elmentheti *"megnézem később"*  vagy *"kipróbálom"* mappájába,
ahol később bármikor elérheti, esetleg törölheti is azokat. Biztosítani
kívánunk a felhasználó számára egy *tetszett*, *nem tetszett* gyűjtőt is,
ahová gyűjthetik az általuk kedvelt és kevésbé kedvelt játékokat. A navigációt
egy menüvel kívánjuk megoldani, amelyen szerepelne a kijelentkezés lehetősége is,
amennyiben be szeretnénk fejezni a tevékenykedést az adott felhasználón.
Az egyik menüpont lehetőséget kínálna arra, hogy új játékot adjon hozzá
valaki, amelyet később a rendszergazda ellenőrizne, és amennyiben semmi
probléma nincs a felvett programmal, az be is kerülne a rendszerbe azzonnal.
Lenne egy keresési felület is, ahol a játékosok a számukra megfelelő játékokat
keresheti bizonyos szűrőfeltételek megadásával. Lehetőség lenne továbba
az egyes játkok értékelésére. A nagyobb értékelésű játékok előbb jelennének
meg a szűrés eredményében. Egy játék kiválasztása után bővebb információk
jelennének meg róla, mint például: kiadás dátuma, rövid leírása, értékelések,
teljes cím, egy poszter, valamint egy gomb amely elviszi a felhasználót a
játék előzeteséhez, vagy maga az előzetes fog megjelenni az alkalmazásban.

### VI. Megvalósítható?