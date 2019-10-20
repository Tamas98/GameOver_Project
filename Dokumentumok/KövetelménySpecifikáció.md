# GameOver: Követelmény Specifikáció


### I. Bevezetés

A mai világban vitathatatlan a gaming szerepe. Óriási népszerűségnek örvend, minden eddiginél nagyobb tömegekhez ér el. Ennek köszönhetően a felhasználói bázis hatalmas. Manapság már szinte mindenki "gamer"-nek nevezi magát, aki játszik bármivel is. Legyen az platform mobil, ami roppant módon tör felfelé, hiszen a mobiltelefon mindenki zsebében ott van és bármikor elő lehet venni az unalmas órákban. De ha valaki komolyabbra vágyik, azoknak ott vannak a konzolok, amelyek segítségével viszonylag baráti áron lehet a csúcs játákokkal is játszani. Aztán aki a maximális elményre vágyik, annak ott van a PC, ami pedig még mindig a gaming csúcsát jelenti. Szinte egész évben, gyakorlatilag minden napra jut egy-egy játékmegjelenés. Nagyon telített a piac, óriási a verseny. Számtalan nagy kiadó, illetve indie fejelsztőcég verseng egymással. Elképesztő összegeket költenek el marketingre, nem beszélve magának a játék fejlesztésének az áráról. Mindenkinek a célja, hogy minél nagyobb tömegekhez tudják eljuttatni a saját terméküket. Ebben nagy segítség manapság a streaming, ami mára teljes mertékű állássá nőtte ki magát. Erre nyilván nincs minden embernek ideje, hogy folyamatosan figyelemmel kövesse a játékpiac helyzetét az elő adások által. Illetve ne feledkezzünk meg az esportról sem, ami szintán nagyon törekszik felfelé. Ma mindenki meg tudja találni a saját magának megfelelő játékot vagy játékokat. Választékban nincs hiány. De megtalálják ezeket az emberek? Mert az AAA játékok még csak csak eljutnak tömegekhez, ha eljutnak. És a többi? Vagy aki nem a legnépszerűbb műfajokat kedveli? Ha nincs ideje az internetet bújni órák hosszán át. Nagyon megnehezíti a dolgot, hogy mára minden cég saját launchert készít és kizárólag onnan érhetőek el a játékaik. Nem beszélve arról, ha a különböző platformokat nézzük. Teljes káosz. Főleg annak, aki most szeretne becsatlakozni. Viszont a legtájékozottabbak figyelmét is elkerülheti egy-egy új megjelenés. Lehet, hogy pont az lenne élete játéka, de épp elkerülte a figyelmét. Erre a fennálló problémára szeretnénk megoldást találni. Nem csak megoldást talalni, hanem megoldást nyújtani. Egy olyan program megalkotása a cél, ami összegyűjti az összes videójátékot. Megkönnyítve ezáltal a keresgélést. Sőt, az ajánló rendszer segítségével már mi is megpróbáljuk kitalálni, hogy mire vágyik az adott felhasználó. Azon leszünk, hogy ez a lehető legjobban meg tudjun valósulni.

### II. Jelenlegi helyzet

Jelenleg az a helyzet, hogy mindenki onnan tajékozódik, ahonnan tud. Ami nem hangzik túl jól. Nem létezik egyetlen átfogó megoldás sem. Persze lehetőség van sok. Újságok, weboldalak, különböző portálok. YouTube videók, Twitch streamek. Vagy akár maguk a launcherek. De mindegyik más. Teljesen függetlenek egymástól. Kit, melyik cég támogat, szponzorál. Elvonva ezzel más kiadók elől a lehetőséget. Nem beszélve arról, hogy ez mennyire idő igényes tud lenni. Ennyi forrásból naprakésznek lenni szinte teljességgel lehetetlen. Pedig mennyire egyszerű és kényelmes lenne egyetlen program segítségével ez az folyamat. Azt hisszük ma ennek már léteznie kellene, mert szükség van rá. Mégsem létezik. Szeretnénk egy olyan szolgálatatást nyújtani felhasználóinkak, ahonnan egységesen, egyetlen helyről tudnak tájékozódni a videojátékokról. Nem beszélve az ajánlásokról, ami arról szól, hogy kitalálja a program, mi is az ami nekünk való lehet. Emelett egy nagy közösség is létrejöhet, akik kommentelnek, megosztják véleményüket, értékelnek. Ezzel is segítve és támpontot adva a többieknek. 

### III. Vágyálom rendszer

Szeretnénk, hogy rendszerünk mindenki számára elérhető legyen. Biztosítani
kívánjuk a felhasználóink számára az **egyéni adattárolást**,ennek érdekében
a **bejelentkezés** lehetőségét meg kell adnunk a felhasználóinknak,viszont
arra is igényelnénk esélyt adni a felhasználónak,hogy **vendégként** jelentkezzen
be, így viszont nem mentve a böngészése adatait. A bejelentkezést követően
,amennyiben az nem vendégként történik, szeretnénk, ha az ügyfelünk böngészése
alapján **ajánlást kapna**(naponta 3-at) az általa legtöbbet megtekintett kategória
egyéb játékaiból. Ezeket _megtekintheti_ vagy ha nem talál közöttük megfelelőt, 
_mellőzheti_ is őket. Ezután a böngészés lehetőségét kívánjuk megadni a 
felhasználónknak, aki kereshet témára, címre, kiadás dátum szerint vagy
akár kiadó szerint is. Az egyes játékoknál szeretnénk,ha fel lenne tüntetve
a játék  neve, kiadási dátuma, témája, egy rövid leírás, a posztere, illetve
esetleg a játék előzetes is. Erre azt a megoldást is elfogadjuk,ha **egy gomb
jelenik meg** a kijelzőn az alábbi szöveggel: "Előzetes megtekintése".
Esetleg, amennyiben megvalósítható, egy olyan funkciót is elképzeltünk,
amely lehetőséget ad a felhasználók számára **új játék hozzáadására**. Egy
folyamatosan,az ablak tetején elhelyezkedő menüvel kívánjuk biztosítani
a _navigálást_ az alkalmazáson belül. Nem specifikusan otthoni felhasználásra
szeretnénk ha terveznék a szoftvert, inkább _internetkávézókban_ és _könyvtárakban_
képzeljük el használatát, ezért úgy képzeltük el, hogy a jelszavakat **titkosítva**
tárolnánk a számítógépeken. Szeretnénk,hogy folyamatosan bővítsék és karbantartsák
az alkalmazás elkészülte után is, **évenként legalább egy nagyobb frissítést
tervezünk kiadni.** Terveink közé tartozik, hogy később az alkalmazás felkerüljön
az internetre és egy bárki számára bármikor elérhető **online szolgáltatás** legyen
belőle. 


### IV. Jelenlegi üzleti folyamatok modellje

Jelenleg nincs vagy nagyon kevés olyan lehetősége van a mai felhasználóknak , hogy a **saját**
ízlésük szerint válogassanak a világon megjelenő valamennyi játékai közül, **gyártótól függetlenül**.
Ha már válogatásról van szó, akkor fontos az is nyílvánvalóan, hogy milyen stílusú maga a játék, egy (single player)
vagy akár többszemélyes (multiplayer) játékról van-e szó és így tovább. Tehát maga a **felhasználó 
szempontjait** követve tud keresgélni a játékok között és ezzel nagyobb valószínűséggel tud olyan 
játékokat találni magának, amivel szeretne játszani. A gyártó függetlenséget azért említettük,
mert manapság a legtöbb játékokat gyártó cégek saját indítófelülettel rendelkeznek , ahol
értelemszerűen az általuk támogatott játékok jelennek meg. Ezért sok felhasználóhóz nagy valószínűséggel
nem juthat el olyan játék aminek sokkal kisebb hírneve van de sokkal nagyobb élményt nyújtana
a játékosnak, ami főleg abból jön, hogy nincsenek megfelelően szelektálva a játékok, csupán annyi
a lényeg manapság, hogy a legnagyobb cégeknek a legnagyobb játékait vásárolják meg az emberek
látszólag. Ezért gondoljuk úgy, hogy egyre jobban szükség van ilyen fajta szoftverekre ami segíti
a felhasználókat a **játékok közötti böngészésében**, függetlenül attól, hogy mikor készült a játék,
mennyien játszanak vele, ki a kiadója. A projekt keretein belül szeretnénk ezen problémák megoldására
egy megfelelően  működő programot létrehozni.

### V. Igényelt üzleti folyamatok modellje