package com.sda.javagdy5.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

class FactorialIterativeTest {

    private static Stream<Arguments> provideImplementations() {
        return Stream.of(Arguments.of(new FactorialIterative()),
            Arguments.of(new FactorialRecursive()));
    }

    @ParameterizedTest
    @MethodSource("provideImplementations")
    void thatWeCanCalculateFactorials(Factorial factorial) {
        Assertions.assertEquals(BigInteger.valueOf(120),
            factorial.calculate(5));
    }

    @ParameterizedTest
    @MethodSource("provideImplementations")
    void thatWeCanCalculateReallyBigNumbers(Factorial factorial) {
        Assertions.assertEquals(new BigInteger("169951596443651975670936106905268009726857840237226336013137746655786102060954429703093586502331082826160126799371961047247995144715820070247312688604842794768928847291312893896032788114634112357340801046170478091568545158838617903734203035837226035774546144492055388045581638976896837202800910346701805528345780346448737279942799768285740123441113877459743908298928378568056037832672886126415979533891158448523868699977603108952611899206157312431666507530013363132993908823345469036140849433930083908627837996081859089633868991845092390413814366502910303364258473646056963644417904925510079733945695273847607353701001957979303839233109011259150434755085862227371047733279531770221023300431223694678773633509783120992795251134935433303600096493826614284318652162220307491556740982718776566609669634479326884975780836645899251468719034078979946703796700833659276719348286655351002034583924724660441367402080083004659766777494283052777601192072947211204828876249280839843090266089577254988773668901170746466368158027524056266854942629776901104375214407771822962679765794861510440702287992151596790417056702580194755531200365774118302552783542994947614908886621323841139149136905270053165962626883337469881623528374092981297320811491512422804215922176107553566645222634369293115480449684278646031648470315974110656135897117119936689167140663239426051203159415061446452162085232615926793971619371243237919885795620567731951104874039570625761069467078260505478851321742975131890641372519244089290115790076615548628505328877786045112333515559127489781749644061572941149555063425558825585624041597724456759955192578012099806681981197103222463932046307267161736948283096922827696202733225271542717306116806768855614076805923859634261965877464640651051018748769785899191863371550974734959997295624080197920604195253638703752047659067197152717944878053870052052670452333834137582658488371091066516144366225297018935259644696623758926484494232524357141874504029613149970730385686225732992132224787594231291584670398886648633990543841242941894309607103686902732067651793799088893191373675821844219570281810507961231758794951284522486585924358067441331583880416704772584964787611955079424203075290815131583073553125325743268785756319122579844537691799390859044850450414279628953589179073957923956033884175730938819143780020549508752633505414096190500288634994309017540044233137009053721900257594658528214715721339522617030650434600496837502255429858948832844413756231468632402237889526264014901502807787079606400561069304680687727300456713876228624695100010660344587840799344396305090333998454412690907532288429925280291207418609055606803216182586999215333834189953718435255282955575054736873663059092116126723853840816368829287043212624078831291897123335295913982906902503232995930740081415502291676740484476932236926395010403588369557749285880963785218816241505416041443361377993203497163276680025989169299531424153107153962486584423851737879020050697407622369701595487487055826936904663705595996327302437582905206863088735357469915185316057294081800265621183747276485862706036013213731622802656341669233244628364187820436060765060921926229164551887151964789768926560518600687531858445412595337424049714704202916761683508191587154694907938470059683470369316959701285517233532290320633607168262305673985626047073525917613512134581686553877943883117600364435760366089493072611829057864961950011789080356972974544315809092514907511525812841647667756110781511087728264608227816947035574492838075935770575250528064998435910709319285379043551829450932219788077763938109995419757942439215860006545108102360911754590181154734817810025082069430901330467235998124578591996101378880066801514055746848709489147930774586462778926187516005952558665216394202954516402948090585983609720676195726962781554688094593627225833619249521345701588950700469851944335418643121668140961332365083551878907700202014028936259681834786786395402572781843016642859607645104758068877270556168656679432700380811256940111798771148487017645355484798662185892063445255128420433007840951008125478194931000767447262514782956597480398265254612040615285027810494170227710336736445461940959750910599894792877438375503463844308635179722662297399564910219078070345383059347085380948461952690705620160700988049647123829396015077881872712217728541085350567107830317390917558851035832214773248750670884434558059571684229948611888632747504413473618951577094763610145905218356436149465422171133936409636343335502831941955947444801444481398486278583998682955451559262301138275711479881607490607581638271866646818694488739668762271728748036309571833385245654560165648366973454959847898527193875997710198352537877966107394601201351632936827140722025325312527397610525692492897605588347649334452329730702313946554469625038077138467087501419341760503547370849244503316371064914891356975943456649690965240563144768786182576342763144202528773628679114689966171049786862489513694133511911829163365326555513160228454986210317867952925756072270174606949579602413899649048109232155070423880860104835689609211005044441654362788191376795591266045764797416809012899683193679421146118318004619628892522315350980838017266998207561856469730829513998435340135487217418187621715855253156139967986415818849466564723549197476670455253354905695010809781663535213090745769977806034757357666978835278203915475155802772652293781147570252185940690652070290167606938541262045231749560042605886148513012674916263544003776045940088532554238558420588525097726835062153119259468831138496772432750099350650681463989025011144222048724413683533414308235673011068207981684080919243477105415177743089741705656936946769574602290356896202530596586798443054765877474974706381428823975697980014241124457945125802281428218267909300893006476531892126635453625010951230334834923259460082477747759757318638957899638324376978362458108081924911927157168889486586500758135574345207220606018681527416084884650785612934391370133978680022017518429062955933247483286296769112654227831497514797547338255283638622045112438444241178231298482643267672623918513709475009052377673088248340646430977887534004276603194043813692178192693481607547214463366569788274174539323786757289242812012439597341631933594740505597619621175459315253419220618723284456163461385329619329546319079742242893339363748283436842664685166048333381768072835355167845664021450676309675435000528918691734955166161502641729826402920087366894094349586845062188873550728524757466180918529182974782503629967453716671155367083537372890350846781248844017965664445022403476921974788281624405009229698971695227305807063316537401308760762352220198379862195300809072822242684847700021630045568668898648381456334266602395999692591570470509621714158148630756607261201210196728938722036340456526084723052577350598686851368908000985075589665455347555274033286129989447677473554714718965966550844150582198085454572416432548505983611271058631091635909827488592723279821116978367686251493822580952829548949758787257680932816019153062326738550018449975236251180123962744408683948681265294337959391940578798847378232987281152471485360831653916573330236129848048435326007414921471732443411561090063288886906769729650091250508059897416935666341069522923110602326934445771959447466348334963928210597922293833207000042707393280874959795192429227717759090907626316556325784421719839404529523593958410744734531602762196091937630947288345715179579295344066287806381572562986321112495500707224945780843142747210111567051758763797615075694451383637081539253979385485346088192764256749478432433467021621872827713971123002169034644014010010996150985665535029484691292063427991095282992718860264882886425574914828366597396842388511288721782604643069484857728039691268907226782454093729677753946832974831570698485370493509350369230530889540227351843224633648261313443594552917601759539490052605176402789413137086516655308987484540067236632338097354337618956323970653468135357718943086497425687150877935353290923567508523251887764355194377586021289905794825401534689557875488643370513025882631932564400773293809220324239181150924711785152385858219654983081971245520524796713915054430433742448844767949772936262237604374935314119386559110530093770512619063342072422802676143510611945305956242820920206179377021131537188340040650813215301047840158142838427225213641101678251399082446256875757699251808340572053029131821889193062006775507372178503541542188829206276883227142279186186114650570847544420188730085725501790231362532485909141839752067288188905232313808088337431269060502626409073444876821209131430994475516817450647082655517151007123683614391037556377053632953437976410771324336786868062653236918865353332845810643215878079269512110024032166936010400136341201463901504862994674012244090533251050665087818006032215666739608108196723725281772703499665282435987673478018971976077318219653545808129088172914976482380863334529792693945145955295135792358796924650288998074670204873883922619366356125857013535443366222376470184508191078711531380147486067786591247732052053879882492849248275192895498746358762394217799949008188592714146000910558600488464717891504657486168061750940151180371973511228878916621996934211722753789738232969382275622324853102153679707383781282301088731758134887859998902932555152019150849963887554177176320820321904382819690756182966691063893167048341032340784285932830714344755207382105237357668702025353465600315643922112120185363321052443162776308540918638385809045259252965174356090452046385653996319074169653633059347294869416141160134420184665314074103555757292823926565528825210986700867865696161585464495067036289666412020439065701602457095291377406559521636424069061330225607862003009481420171054195022929859884840235109002978790775339964963641190425165886644996154172482070190926829074737307550453714275559899235832817345654665300274689313685401110363713237206099223196853037196457695209780285450769559977382820246634372833322063699118435311225986559536823127324316610425652422464016394113213624260370967333115939936541980550765448084132102333240711120460137390180280301916065566324727100499293631209806410248475750528482917805051338944004689366491926769027309662941948309749752008935496572692456164378085956238123725101497981480197026377775488833489489788450823061163162482903356463624051804144732817846926950619450355346033156911776853333426524175662404690557254611458803277309938694045055068692610762017366198682456463666254830089032022194193012172013395750191675383891391095768579058377282727204614412964479097702743368630881665369401410737477133019746849015068042649371238545865631523748059373345187342583402126968727241583128723928004109928332851820946554591003672286261576511670470980896398282531062134132380140961641008047349676165120303192525481762491797414973432157037423649856700333197114702154446786308357859292241149263792668229311746387162301139909965324535433135849943369605103432670695493671715367034187096945649554307957957609486154739852618868614036915135635426148445761475273505696972449895970088625081695359968866172099090792420065960342073419880830841911993780218904425453628398376681162289232732286727796313070470269389688539095354418229796973852133363898590535611163520527845932058865433728265284048972166877419339820041259230575823261237053798441374269391036377706128861362212318491706633381352057239662894514453019858802427464049595027571155643400749604070854390631175523196824796452672648377160373000917114070997970879144729102435629884018410463402505168718610964767873956454274874086409501033427599152700684633965979080473903734320943542207191446860944056834731493824677263643227017028787928427847049913246689548487679595996675750440906799268839446115084762632028725109001391015774368464892264988661538904966828992638729044025723664160268801941323684299122407630158732609179760901753194806691281935384112010731526688607705361328208050727957991537021327130308287560031379143446813521338231859217896055496696081101012238622891601993590478161120874248361515565773725546643756364974250652878535345441926526418956615147783296673580616556584884319059228282255366174969510450162945441380201700336166741913535198745434861870092973064725065906734398807098385770784349595868099454890308294980283498090148622690796487311592320194641758363895872843864105060822307937119497478735108041117585085496364643653102175693046992946693994001653527940849415801478416430527653139525096423143773481206320496875119478408377420371872624123080923180166620299266682335267116969003860848442238637465302991928154379173101767807362791456298631360866809878520655877534870646920462952636295639237100954899378306447886151254905153895619460325299019152356658441152906186708554306290915578418887284538790033119563553735809035370544749990446336530503695950334174822116945112928035160527161470700215342163788641270264564680679744679839196015622417895437143223256235791723510239347768086409132072026692433617312487569603437465837274039170721585051719597972468590965454184353821781774565642399194731194697249950827066449632256344996485056682538583000437160377837634644953343438151044515612460575742727248323822793636140062029532422835186671847619229773181060718327094335293346072092910255355138407193740124424445603899950676630080490945425482422731612478694213199378883573208548200924458576405229972625336277985082877717645670438413961704158589851392896989523250117649059563244137080237889043413960726295707833288192807987864269128497841524704406975251951996100841483608304426363628681139968539012762074437342239073333545942640471709481135593342543517048212927174956779928371090178171998286110152681646141088164174285851807236402052373856463127297982933556360966315608288938291982288669936481303986313044569247241558179253269228556550890943150276147876668166008099866860255762207587324241987659456329610979223659785093791240664526928952900376345439714074841758291431791730243871249310103735334819631109480019283221429487753984077503116225629149451088213746752802719593210834704194682227915243272510778337483374701322905895669496454940654365859838787287474968703677199382531297480920337315855716253941867509697793736161164861847860893696528022456993361886553902447784436776558121007893274520477297822095267305483943815103743102906073364438331190499434659728521318622115970528843767759552800016408891557741135944728461594090261955053749288980819080965846236414450727989537938125555426257881516437683528804498193909246208558764496357949319805953727093692452537967015249598335787710789520696522278585144881554115878441921120053686165876053301096021767638152232703083951445502448813572902324952479489886884433541621087574094382890075125564060846626616853884167623024274568914403836835265713986583271387161896343905463152391824161446479714698983502364439977875931637172854980752510316189732707245697007666784279478451142455533737145116042952962160446996683259155465515963130881456930362589534025312784582130434287685388737372843896820477945658440765457110721352479782193258823319176205848275193134118337315190854749781871350227397386652787988063293166217519500776284659668495618280711462523952905657734739225426955811948464949903820626388662154859787483138785114366694662904830964305446536403108675135998103598554244969801683131348057093460843070872960027064300167436415724520361742676265932275025403669719042426110954980646043362643775994676589118240575447003558481200273653869007748824196562505786239666485471555966291112983736951766670645697366111231875196719375404918465359586631032662152618911181720172575660524484837026461986817150967447590164295940992437043173465342090347250775447874943778770250367434617242637315214277317556135938971844685657812075687228862573712892282739134214117141726476000686890324367109796601660678611548541166597572564340533765724794109280235330448590968248905521214627135168262622571194010392119103507275107979860912181344867133382763612980841393600341803100893579429950462901049274913678337894028121698461052377380025981326948586601483352432601025294046664633347628723417977076348137975007496228840829928988207220293806431806865223764142032294713777534380126248065755466537486906862158470240111674797305068861971055792401236383968550028922944926924153914829498216587968287858411869403480022273555649404406428972981810316349254813635950950411541203065941713459448875543756720453608079034933253270087932161407466518912255547896726159925353358124249128629656091304542164083162449152584811274590141262216388083116228576415159359070065336407372118480901608696953908483134181648875875742793102725125532528988968153884670241912610933074059057717754404082921550826499201045344748896058771367287858224893078254478499945619645060219463347799005744645078262000479736221453476032279629181870369976904685997941940845498810025345286575227111177643301316244964476322130419120226409611312290331355759946678820350591993256745976799361410330986390953127193612879984860265931942325862288422582668110862048305581283047377542488680226293434449550494282761735771790912389746058047493826819532573855795933290543094093195512664997842872028106905851885780992000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"),
            factorial.calculate(5556));
    }
}