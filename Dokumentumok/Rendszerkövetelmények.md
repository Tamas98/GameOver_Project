# GameOver: Rendszerkövetelmények

## I. A rendszer célja

## II. Projekt terv

## III. Üzleti folyamatok modellje

## IV. Követelmények

## V. Funkcionális terv

## VI. Fizikai környezet

## VII. Absztrakt domain modell

## VIII. Architekturális terv

## IX. Adatbázis terv

## X. Implementációs terv

## XI. Tesztterv

A tesztterv megintcsak egy olyan fejezetet takar, ami valószínűleg kevésbé tűnik fontos feladatnak, emiatt sok projekt során elfelejtődik. Vagy lustaság, vagy időhiány miatt. Ami nagy hiba. Mert igenis nagy jelentőséggel bír. Ezért a mi csapatunk fejlesztése során szintén fontos pont a rendszerünk sikeres elkészítésének folyamatában az, hogy megfelelő tesztelést vigyünk véghez. Semmiféleképpen sem szeretnénk azt, ha a kiadás után bármilyen hiba maradna a programunkban. Legyen az súlyos, vagy akár kevésbé súlyos. Illetve azt is mindenféleképpen szeretnénk elkerülni, ha valami nem úgy működne ahogyan mi elképzeltük. Vagy még rosszabb esetben egyáltalán nem. Mivel ebben az esetben a felhasználók nagy része hamar elpártolna a programtól és a későbbiekben szinte lehetetlen lenne őket visszacsábítani. Mindezek elkerülése érdekében folyamatosan felügyelni és ellenőrizni fogjuk a rendszerünk működését, már a fejlesztés elkezdésének legelső szakaszaiban is. Mindezen felül egy több lépcsőből álló tesztelési tervet fogunk megvalósítani. Egyrészt JUnit egységteszt keretrendszer fogunk használni. Ez annyit tesz, hogy a kód írásával párhuzamosan fejlesztjük a kódot tesztelő osztályokat is. Ezek az egység tesztek, ami akkor hibátlan, ha az összes teszt hibátlanul lefut. Másrészt külön tesztelési jegyzőkönyvet fogunk vezetni manuálisan, amiben alaposan átvizsgálunk minden egyes funkciót. Ebben is részt fog a csapatunk összes tagja annak érdekében, hogy minden lehetséges esetet végig tudjunk nézni és ténylegesen minden esetleges hibát sikerüljön felfedni. Harmadrészt pedig a későbbiekben, vagyis a program elkészülte után, de még a hivatalos megjelenés előtt külsős tesztelőket is szeretnénk majd bevonni a teljes siker érdekében. Akiknek mindössze annyi a feladatuk, hogy huzamosabb ideig használják a programot és jelentsék ha bármit észre vesznek. Meg azt is ha akad valamilyen észrevételük. Mindennek tökéletesen kell működnie ahhoz, hogy a teszttervünk sikeresnek mondható legyen. Kezdve azzal, hogy a felhasználói felületek rendesen betöltődnek-e, a menü elemek, a gombok, a felületek amikkel interakcióba lépnek a felhasználók mind mind működnek, méghozzá pontosan úgy ahogy azt mi elvárjuk. A bejelentkezés folyamatának működőképesnek és gördülékenynek kell lennie. Pont úgy, mint minden más részegységnek is. A program legyen megfelelőképp gyors, hogy a felhasználónak öröm legyen használnia. Csapatunk a tesztelési eredményeket részletesen fogja dokumentálni. Az eredmények függvényében két lépés közül tudunk majd választani. Hiba vagy hibák esetén, azok javítása után újra végigcsináljuk a teszteket és visszaadjuk a projektet a tesztelő csoportnak. Ha viszont nem található hiba a rendszerben, akkor pedig a projekt átadásra kerülhet a megrendelő felé.

## XII. Telepítési terv

## XIII. Karbantartási terv
