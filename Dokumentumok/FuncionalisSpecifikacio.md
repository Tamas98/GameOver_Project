# GameOver: Funkcionális Specifikáció

### I.Hogyan állunk jelenleg?

Jelenleg a felhasználók rendelkezésére áll rengeteg lehetőség, amennyiben
számítógépes játékot keresnek szabadidejük eltöltésére. A [Microsoft Store](https://www.microsoft.com/en-us/store/b/home)-ban
elérhető, egy bizonyos [The Games Database](https://www.microsoft.com/en-us/p/the-games-database/9nblggh6jhl9?activetab=pivot:overviewtab),
,valamint elérhető számos weboldal az interneten, ahol hasonló tartalmak
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

### II.A felhasználók álma

### III.Befolyásoló tényezők

### IV.Látványterv

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



### V.A program futása

A program indulásakor lehetőséget kívánunk biztosítani a felhasználónak
vendégként történő belépésre vagy bejelentkezésre. Bejelentkezés esetén
a 3 darab játék jelenik meg az ügyfélnek, amelyeket az alapján válogat 
össze a szoftver, mely témájú játékokra kattintott a legtöbbször eddig.
Itt eldöntheti, hogy érdekli-e valamelyik. Amennyiben van ilyen a felsoroltak
között, azt elmentheti *"megnézem később"*  vagy *"kipróbálom"* mappájába,
ahol később bármikor elérheti, esetleg törölheti is azokat. Biztosítani
kívánunk a felhasználó számára egy *tetszett*,*nem tetszett* gyűjtőt is,
ahová gyűjthetik az általuk kedvelt és kevésbé kedvelt játékokat. A navigációt
egy menüvel kívánjuk megoldani, amelyen szerepelne a kijelentkezés lehetősége is,
amennyiben be szeretnénk fejezni a tevékenykedést az adott felhasználón.
Az egyik menüpont lehetőséget kínálna arra, hogy új játékot adjon hozzá
valaki, amelyet később a rendszergazda ellenőrizne, és amennyiben semmi
probléma nincs a felvett programmal, az be is kerülne a rendszerbe azzonnal.
Lenne egy keresési felület is, ahol a játékosok a számukra megfelelő játékokat
keresheti bizonyos szűrőfeltételek megadásával. Lehetőség lenne továbba
az egyes játkok értékelésére. A nagyobb értékelésű játékok előbb jelennének
meg a szűrés eredményében. EGy játék kiválasztása után bővebb információk
jelennének meg róla, mint például: kiadás dátuma,rövid leírása, értékelések,
teljes cím, egy poszter, valamint egy gomb amely elviszi a felhasználót a
játék előzeteséhez, vagy maga az előzetes fog megjelenni az alkalmazásban.

### VI.Megvalósítható?