package com.example.milatam_test2_mesta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView_Name, textView_Info, textView_Residents;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_Name = (TextView) findViewById(R.id.textView_Name);
        textView_Info = (TextView) findViewById(R.id.textView_Info);
        textView_Residents = (TextView) findViewById(R.id.textView_Residents);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,0,0,"Plzeň");
        menu.add(0,1,0,"Praha");
        menu.add(0,2,0,"Brno");
        menu.add(0,3,0,"Pardubice");
        menu.add(0,4,0,"České Budějovice");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                textView_Name.setText("Plzeň");
                textView_Info.setText("Plzeň (v němčině a dalších jazycích Pilsen) je statutární město na západě Čech a metropole Plzeňského kraje. Leží na soutoku řek Mže, Radbuza, Úhlava a Úslava, z nichž vzniká řeka Berounka. Žije zde zhruba 170 tisíc obyvatel a je tak čtvrtým největším městem v Česku a druhým největším v Čechách.\n" +
                        "Plzeň je známá jako průmyslové a pivovarnické město. V rozsáhlých továrních halách bývalé Škodovky se vyrábějí dopravní prostředky a průmyslové stroje, na druhé straně krajské metropole se pak vaří známá piva Prazdroj a Gambrinus. Spodně kvašený světlý ležák se označuje jako pivo plzeňského typu, celosvětově pak jako Pilsner nebo Pils, podle německého jména města Pilsen. Plzeň má i podstatný kulturní význam. Nacházejí se tu početné kulturní domy a divadla. Ve městě sídlí také biskupství plzeňské diecéze. Vysoké školství zastupují Západočeská univerzita a Lékařská fakulta Univerzity Karlovy.\n" +
                        "Současné historické jádro města má pravidelnou síť ulic s obdélníkovým náměstím Republiky uprostřed (139 × 193 m), jemuž vévodí katedrála sv. Bartoloměje, budovaná od roku 1290.\n" +
                        "V roce 2015 byla Plzeň (společně s belgickým Monsem) Evropským hlavním městem kultury.");
                textView_Residents.setText("počet obyvatel: 169 858");
                imageView.setImageResource(R.drawable.plzen);
                return true;
            case 1:
                textView_Name.setText("Praha");
                textView_Info.setText("Praha je hlavní a současně největší město České republiky a 15. největší město Evropské unie. Leží mírně na sever od středu Čech na řece Vltavě, uvnitř Středočeského kraje, jehož je správním centrem, ale jako samostatný kraj není jeho součástí. Je sídlem velké části státních institucí a množství dalších organizací a firem. Sídlí zde prezident republiky, parlament, vláda, ústřední státní orgány a jeden ze dvou vrchních soudů. Mimoto je Praha sídlem řady dalších úřadů, jak ústředních, tak i územních samosprávných celků; sídlí zde též ústředí většiny politických stran a centrály téměř všech církví, náboženských a dalších sdružení s celorepublikovou působností registrovaných v ČR.\n" +
                        "Do dnešní podoby se Praha vyvíjela jedenáct století. Coby historická metropole Čech byla v minulosti sídelním městem českých knížat a králů, římsko-německých císařů a hlavním městem Československa. V současnosti se rozkládá na území 496 čtverečních kilometrů a má přes 1,2 milionu obyvatel,[1] v pražské metropolitní oblasti o rozloze 4983 km² žijí 2 miliony obyvatel.[3]\n" +
                        "Zároveň je Praha také vysoce ekonomicky vyspělým a bohatým regionem s výjimečně vysokou životní úrovní,[4] přičemž tímto vyniká nejen nad české, ale i nad evropské standardy.[5] Podle statistik Eurostatu je devátým nejbohatším regionem v Evropě. HDP na obyvatele v Praze dosahuje 171 % průměru celé Evropské unie (HDP na obyvatele ČR dosahuje pouze 80 %).[6][7] V Praze sídlí celkem 12 univerzit (vysokých škol univerzitního typu).\n" +
                        "Praha je všeobecně považována za jedno z nejkrásnějších měst v Evropě.[8] Historické centrum města s jedinečným panoramatem Pražského hradu, největšího hradního komplexu na světě,[9] je památkovou rezervací UNESCO. Právě historické jádro města a mnohé památky přilákají ročně miliony turistů ze zemí celého světa. V roce 2012 navštívilo Prahu 6 547 700 turistů, je to tedy páté nejnavštěvovanější město Evropy, po Londýně, Paříži, Istanbulu a Římu.[10\n");
                textView_Residents.setText("Počet obyvatel: 1 280 508");
                imageView.setImageResource(R.drawable.praha);
                return true;
            case 2:
                textView_Name.setText("Brno");
                textView_Info.setText("Brno (německy Brünn, latinsky Bruna, v jidiš ברין\u200E\u200E Brin) je počtem obyvatel i rozlohou druhé největší město v České republice, největší město na Moravě a bývalé hlavní město Moravy. Je sídlem Jihomoravského kraje, v jehož centrální části tvoří samostatný okres Brno-město. Město leží na soutoku řek Svratky a Svitavy, má zhruba 380 tisíc obyvatel[4] a v jeho metropolitní oblasti žije asi 600 tisíc obyvatel.[5]\n" +
                        "Brno je centrem soudní moci České republiky, stalo se totiž sídlem jak Ústavního soudu, tak Nejvyššího soudu, Nejvyššího správního soudu i Nejvyššího státního zastupitelství. Kromě toho je celkově významným administrativním střediskem, protože zde sídlí státní orgány s celostátní kontrolní působností a další důležité instituce. Za zmínku stojí například Úřad pro ochranu hospodářské soutěže,[6] veřejný ochránce práv[7] nebo Státní zemědělská a potravinářská inspekce.[8] Od roku 1777 je Brno také sídlem římskokatolické brněnské diecéze, biskupským chrámem je katedrála svatého Petra a Pavla na Petrově.\n" +
                        "Město je významným střediskem vysokého školství s 34 fakultami čtrnácti univerzit a dalších vysokých škol s více než 83 000 studenty.[9] V Brně je zákonem zřízeno studio České televize[10] a Českého rozhlasu.[11][pozn. 1]\n" +
                        "Na Brněnském výstavišti jsou tradičně konány velké mezinárodní výstavy a veletrhy. Rozsáhlý areál výstaviště započal svůj provoz již roku 1928 a dnes je považován také za jednu z kulturních památek města. Největší zde pořádanou událostí je Mezinárodní strojírenský veletrh. Brno proslulo i coby dějiště velkých motoristických závodů konaných na blízkém Masarykově okruhu, tato tradice sahá až do třicátých let 20. století.[12] K nejprestižnějším závodům patří Grand Prix ČR, součást seriálu Mistrovství světa silničních motocyklů.[13] Brno také každoročně hostí mezinárodní přehlídku ohňostrojů Ignis Brunensis, pořádanou od roku 1998.[14] Návštěvnost této události se typicky pohybuje mezi jedním až dvěma sty tisíci návštěvníků po každý den jejího konání.[15]\n" +
                        "K nejvýznamnějším dominantám města patří hrad a pevnost Špilberk na stejnojmenném kopci a katedrála svatého Petra a Pavla na vršku Petrov, utvářející charakteristické panorama města a často vyobrazovaná jako jeho symbol. Druhým dochovaným hradem na území Brna je Veveří, kdysi vybudovaný nad řekou Svratkou a dnes se tyčící nad Brněnskou přehradou. Další významnou památkou je funkcionalistická vila Tugendhat, která byla zapsána mezi Světové dědictví UNESCO.[16] Historické městské jádro bylo vyhlášeno městskou památkovou rezervací.[pozn. 2] K turisticky atraktivním lokalitám patří také Chráněná krajinná oblast Moravský kras, jejíž nejjižnější část se nachází na území města Brna.\n");
                textView_Residents.setText("počet obyvatel: 377 028");
                imageView.setImageResource(R.drawable.brno);
                return true;
            case 3:
                textView_Name.setText("Pardubice");
                textView_Info.setText("Pardubice (německy Pardubitz) jsou univerzitní a statutární město na východě Čech, metropole Pardubického kraje s výraznou správní, obytnou, obslužnou a výrobní funkcí pardubicko-hradecké aglomerace. Leží ve východní části Polabí na soutoku řek Labe a Chrudimky, přibližně 100 kilometrů východně od Prahy a 20 km jižně od Hradce Králové v nadmořské výšce přibližně 220 metrů.\n" +
                        "S téměř 90 tisíci obyvateli jsou desátým největším městem Česka, jsou i největším městem Pardubického kraje i okresu Pardubice. Výměra území města je 82,7 km². Pardubice se dělí na 8 samosprávných městských obvodů a 20 katastrálních území. První dochovaná zmínka o existenci Pardubic pochází z roku 1295, k roku 1340 jsou už připomínány jako město. Největší rozkvět prodělaly za pánů z Pernštejnů. Na konci 16. století a v 17. století nastal úpadek. Nový rozvoj města přišel od poloviny 19. století s připojením města na železnici. Vznikla zde řada průmyslových podniků jako lihovar, cukrovar, továrna na mlýnské stroje, Fantova rafinérie minerálních olejů a další. Po Druhé světové válce došlo k masivní výstavbě nových čtvrtí především na okraji města a počet obyvatel se rychle zdvojnásobil.\n" +
                        "Sídlí zde Univerzita Pardubice, dále např. okresní soud. Historické centrum je od roku 1964 městskou památkovou rezervací. Hlavními průmyslovými odvětvími jsou průmysl chemický, strojírenský a elektrotechnický. Už od 16. století jsou proslulé výrobou perníku. Významné sportovní události jsou slavné koňské dostihy Velká pardubická, motocyklový závod Zlatá přilba, Mezinárodní festival šachu Czech Open či tenisová Pardubická juniorka. Známá je železniční a letecká doprava. Od roku 1909 tu sídlí Východočeské divadlo, působí zde profesionální Komorní filharmonie Pardubice.\n");
                textView_Residents.setText("počet obyvatel: 89 638");
                imageView.setImageResource(R.drawable.pardubice);
                return true;
            case 4:
                textView_Name.setText("České Budějovice");
                textView_Info.setText("České Budějovice (německy Budweis, popřípadě Böhmisch Budweis) jsou statutární město a správní a kulturní metropole Jihočeského kraje. Leží v Českobudějovické pánvi na soutoku řek Vltava a Malše, mají přes 93 tisíc obyvatel a nachází se v nich řada historických památek a muzeí. Pro ně a blízkost dalších historicky cenných míst (Hluboká nad Vltavou, Český Krumlov, Zlatá Koruna, Vyšší Brod, Třeboň atd.) jsou častým cílem turistů. Ve městě sídlí Jihočeská univerzita v Českých Budějovicích a biskup římskokatolické českobudějovické diecéze. Historické centrum města bylo vyhlášeno 19. března 1980 městskou památkovou rezervací.");
                textView_Residents.setText("počet obyvatel: 93 513");
                imageView.setImageResource(R.drawable.budejice);
                return true;
        }
        return false;
    }


}
