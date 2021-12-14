package com.algotrader.starkex.hashing;

import com.algotrader.starkex.signature.StarkCurve;
import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;
import java.util.List;

/**
 * Points used when calculating pederson hash function
 *
 * @author ferat capar
 * @see PedersonHash
 */
public final class ConstantPoints {
    private static final StarkCurve curve = StarkCurve.getInstance();
    public static final List<ECPoint> POINTS = List.of(
            curve.createPoint(
                    new BigInteger("49ee3eba8c1600700ee1b87eb599f16716b0b1022947733551fde4050ca6804", 16),
                    new BigInteger("3ca0cfe4b3bc6ddf346d49d06ea0ed34e621062c0e056c1d0405d266e10268a", 16)),
            curve.createPoint(
                    new BigInteger("1ef15c18599971b7beced415a40f0c7deacfd9b0d1819e03d723d8bc943cfca", 16),
                    new BigInteger("5668060aa49730b7be4801df46ec62de53ecd11abe43a32873000c36e8dc1f", 16)),
            curve.createPoint(
                    new BigInteger("234287dcbaffe7f969c748655fca9e58fa8120b6d56eb0c1080d17957ebe47b", 16),
                    new BigInteger("3b056f100f96fb21e889527d41f4e39940135dd7a6c94cc6ed0268ee89e5615", 16)),
            curve.createPoint(
                    new BigInteger("3909690e1123c80678a7ba0fde0e8447f6f02b3f6b960034d1e93524f8b476", 16),
                    new BigInteger("7122e9063d239d89d4e336753845b76f2b33ca0d7f0c1acd4b9fe974994cc19", 16)),
            curve.createPoint(
                    new BigInteger("40fd002e38ea01a01b2702eb7c643e9decc2894cbf31765922e281939ab542c", 16),
                    new BigInteger("109f720a79e2a41471f054ca885efd90c8cfbbec37991d1b6343991e0a3e740", 16)),
            curve.createPoint(
                    new BigInteger("2f52066635c139fc2f64eb0bd5e3fd7a705f576854ec4f00aa60361fddb981b", 16),
                    new BigInteger("6d78a24d8a5f97fc600318ce16b3c840315979c3273078ec1a285f217ee6a26", 16)),
            curve.createPoint(
                    new BigInteger("6a0767a1fd60d5b9027a35af1b68e57a1c366ebcde2006cdd07af27043ef674", 16),
                    new BigInteger("606b72c0ca0498b8c1817ed7922d550894c324f5efdfc85a19a1ae382411ca2", 16)),
            curve.createPoint(
                    new BigInteger("7fa463ee2a2d6a585d5c3358918270f6c28c66df1f86803374d1edf3819cc62", 16),
                    new BigInteger("a996edf01598832e644e1cae9a37288865ad80e2787f9bf958aceccc99afae", 16)),
            curve.createPoint(
                    new BigInteger("3d4da70d1540da597dbae1651d28487604a4e66a4a1823b97e8e9639393dbec", 16),
                    new BigInteger("45cdef70c35d3b6f0a2273a9886ccb6306d813e8204bdfd30b4efee63c8a3f9", 16)),
            curve.createPoint(
                    new BigInteger("1e448fdbcd9896c6fbf5f36cb7e7fcb77a751ff2d942593cae023363cc7750e", 16),
                    new BigInteger("30c81da0f3a8cb64468eaa491c7ae7b4842b62cb4148820da211afc4caffb3a", 16)),
            curve.createPoint(
                    new BigInteger("6531acf1a7cb90a4eb27de0b7f915e387a3b0fd063ba6e1289b91f48411be26", 16),
                    new BigInteger("31330f5daa091889981a3ea782ae997f5f171336ed0487a03f051551a2cafa2", 16)),
            curve.createPoint(
                    new BigInteger("54be016394d5662d67d7e82f5e889ed2f97ccf95d911f57dd2362c4040ed4f4", 16),
                    new BigInteger("c6cb184053f054d6a59c1bf0986d17090d25089b3fdcdaf185edc87ef113e5", 16)),
            curve.createPoint(
                    new BigInteger("35b9ecd0499ca1d5d42dcbb0c6b4042b3733c64b607ca711e706e786ef2afc6", 16),
                    new BigInteger("5624b476a5b21c3a544f0712d4817b06ad380a5a6529d323bf64da8ef862d8d", 16)),
            curve.createPoint(
                    new BigInteger("4ce0378e3ee8f77ed58f2ddbd8bb7676c8a38bfb1d3694c275254bd8ca38e23", 16),
                    new BigInteger("5a16fcbff0769c9cf2b02c31621878ec819fff4b8231bff82c6183db2746820", 16)),
            curve.createPoint(
                    new BigInteger("648d5c6f98680a1b926bfeb01c00224c56fdcf751b251c4449c8a94f425cfcf", 16),
                    new BigInteger("72c05ac793cd1620a833fbe2214d36900ebe446e095c62fcb740937f98cca8c", 16)),
            curve.createPoint(
                    new BigInteger("bd09be3e4e1af8a14189977e334f097c18e4a8bf42577ef5aafa0f807bd89b", 16),
                    new BigInteger("6e0e72ed7eb65c86cee29c411fb4761122558ee81013344ba8509c49de9f9b6", 16)),
            curve.createPoint(
                    new BigInteger("35ea4e339b44ae7724419bdfbe07022253137a4afb7cbaffad341ea61249357", 16),
                    new BigInteger("3665d676a026a174f367bb4417780e53a7803cb02d0db32eb4545c267c42f14", 16)),
            curve.createPoint(
                    new BigInteger("36457bc744f42e697b825c2d1afd8f4029d696a4514710f81da52d88e178643", 16),
                    new BigInteger("7c93715896735492a68c7969a024b3a8fd538bffc1521538107de1a5f13ce9c", 16)),
            curve.createPoint(
                    new BigInteger("5b3a08ebcf9c109cc9082f70d9df2b9c11b5428ee23917b4e790c4c10f6e661", 16),
                    new BigInteger("9d7b42ab0c20f5510df7ea5e196eec99342739077e9a168198c89da859753", 16)),
            curve.createPoint(
                    new BigInteger("21883ef8580fc06e59481955d52ece3aca6e82c8c9fc58e216dcf46f96990c6", 16),
                    new BigInteger("51a6423543e6e8a43e71da34cd90f5b520b8d33b67c4bf857573ab9e301aa4c", 16)),
            curve.createPoint(
                    new BigInteger("19e86b77f9b581e81092b305c852faf53940a8f15f0a6990c414f04c0fa7ef9", 16),
                    new BigInteger("515630e35d4398c9c79fc4ee08e1023fa47d8e03c6e7819c6d2ccef45398fa", 16)),
            curve.createPoint(
                    new BigInteger("888ab8eb4c31bb2ac5b54aa320dbe1a69c96b864e8a5f54d89c1d1a6b86c24", 16),
                    new BigInteger("730e148467f6a55ce22c5296f5380df88f38de76ef0b2de844cd3094aaaf3ea", 16)),
            curve.createPoint(
                    new BigInteger("75e79ff13a894e7120dac17b7429c0c32ce7828f726c9973728c0977a5f5977", 16),
                    new BigInteger("4960526e59c1c736561a201bc56f7d762641b39f609d273cc996f5d9197cfb8", 16)),
            curve.createPoint(
                    new BigInteger("640fe009249115d7254f72ecafb3006139e4bed7e9041af51458c737282d1d5", 16),
                    new BigInteger("3cc6c978a575246e2ce4f7ef1fcc7f63085db9ff98a1b1f3fe374087c0332c", 16)),
            curve.createPoint(
                    new BigInteger("6d6fd09ccab7c26de9b3906191235deb5c34685580c488275356a05e209ca96", 16),
                    new BigInteger("7157f81a34213dd8f91dea4f6df1bcfabc4ee091a3049eeeb3b7923d39b8645", 16)),
            curve.createPoint(
                    new BigInteger("5531ca1d00f151d71da820918f74caf2985b24dca20e124721fff507b5a5876", 16),
                    new BigInteger("518529643d3f25e47f72c322223ba60a63d6bfe78cf3f612215d9c19bf29200", 16)),
            curve.createPoint(
                    new BigInteger("6192d454e4f8fe212bdfccd5b15dd5056d7622ffe456c6c67e5a7265aea49c4", 16),
                    new BigInteger("2377a45dc630017ae863cb968ddb38333a70c7946d8684e6d7a6213f634b7bc", 16)),
            curve.createPoint(
                    new BigInteger("542fb44b4ef3640a64fdb22a2560fb26668065c069cf31d1df424819a39ff18", 16),
                    new BigInteger("5dbae9b0948e0361aea443503840341c322aa1a1366ce5390e71bf161f78f8c", 16)),
            curve.createPoint(
                    new BigInteger("299ff3e3412a7eb4cb4a3051b07b1be2e7b1c4b789f39ffb52cba3d048b71de", 16),
                    new BigInteger("1951d3175c02761b291d86b6c0a08387ad5e2a2130ccc33c852530572cb3958", 16)),
            curve.createPoint(
                    new BigInteger("628ce3f5367dadc1411133e55eb25e2e3c2880d6e28754a5cb1c5d109627e73", 16),
                    new BigInteger("ae3e9b7d50964e28bd15380400b7659b87affdef5d2586cbefcd9be7d67c0d", 16)),
            curve.createPoint(
                    new BigInteger("6ea54aff064895eccf9db2283225d62044ae67621192b3346338948382f5933", 16),
                    new BigInteger("6431507e51aadacfaf39f102a8ff387756e9b5e1bc8323d44acae55130d93db", 16)),
            curve.createPoint(
                    new BigInteger("28097d50d175a6235320fe8cfe138dd9e46895d189582e472c38ad7a67d923a", 16),
                    new BigInteger("7f9eab4133d7d09a7ff63368d6135c26262b62336eca1b5ca33f2096ce388ba", 16)),
            curve.createPoint(
                    new BigInteger("619fd09cdd6ff4323973f256c2cbdcb224f7f25b8aef623af2d4a0105e62e02", 16),
                    new BigInteger("2c95f0ae11d47eeae1bc7f1350f75f9185c5bc840382ceb38a797cae9c40308", 16)),
            curve.createPoint(
                    new BigInteger("641c18982ced304512a3f2395942a38add0d6a7156229c2a7c8b8dfbe9beb96", 16),
                    new BigInteger("6f6288c9c659b6af5ac975f4180deffe53d516399b2cc62f31732e9d4ba9837", 16)),
            curve.createPoint(
                    new BigInteger("58ab546e51fe49fc5a382e4064a2bd6cfc268904412f86c26de14f28a71d0f2", 16),
                    new BigInteger("124b7217943e7e328408e8afdfa7da00dcbc94a2bb85fd8e01fb162d2c2c0a9", 16)),
            curve.createPoint(
                    new BigInteger("a82c2fdedbb26c3c762a12f7e86b0e01e65320e0a25a8399d665f6e266bf74", 16),
                    new BigInteger("1a1de28e253f3e10f44d0111e8074f882d7f42e5900780ccbdc31da372d3fd8", 16)),
            curve.createPoint(
                    new BigInteger("744c725a7455a992e3cf5bd007bc234dd4668dba285f553f38350ad94c1615b", 16),
                    new BigInteger("7f721a87f48798bdc4a9c0eb88559e2ad7a74112fd901e70ea159e67a9c33f", 16)),
            curve.createPoint(
                    new BigInteger("434df142ddaa60f7881b6348d91687de40457de7ccfb07f0304b9e820705d0c", 16),
                    new BigInteger("7fae425e3b53f97dd1f5b20e49ed9fe24ff1efc341ba5e017ac89cf8df0cc39", 16)),
            curve.createPoint(
                    new BigInteger("7a1e2b809dff46277021cbc376f79c37e1b683bbd6bca5317014f0dc0e1ae73", 16),
                    new BigInteger("56790278a231912c334eff05281e08af1558e85516b4411ef64647c13bea431", 16)),
            curve.createPoint(
                    new BigInteger("4931b7990348d41cf8907be79f45bb7991fd18f8a57868351c92fa7a34cbcd7", 16),
                    new BigInteger("ca35091815cdf0837d396e25aad6052ad32d497a33b123256cffdc008bc50e", 16)),
            curve.createPoint(
                    new BigInteger("250b815d352fd89f8210b624b147ea7d0a4f47bcac49f3ac9b777840da93ebe", 16),
                    new BigInteger("1173f10e9691948b7da7632f328520455aadcba46e017f891e0a1d7da2bef04", 16)),
            curve.createPoint(
                    new BigInteger("2223b85032fa67292f6e1f822628e6756e5c3cc08fc252ab88d63d624e4dfb2", 16),
                    new BigInteger("55619ba96a7dcec77832fcb22cd5c21c7dcebc0280d730cba0002b67e0a8c63", 16)),
            curve.createPoint(
                    new BigInteger("249b131e04de73af9820d3e22492d9ec51bdc0c4c4f34d95352fa44dd61f245", 16),
                    new BigInteger("7576d3b5d136368ff01170a77d8286d0d1c7c40688862fb40813b4af3c6065e", 16)),
            curve.createPoint(
                    new BigInteger("6777915d9b4769027eb7e04733f8a2d669c84fe06080f55e8a55674dfbf9efb", 16),
                    new BigInteger("640d0ff384c9635e1af364760f104e058e3c86209fa9d2320aeac887b2e02d8", 16)),
            curve.createPoint(
                    new BigInteger("2abe3f237681052f002414399111cf07f8421535af41251edc427a36b5b19c9", 16),
                    new BigInteger("636ce4deaf468a503ab20ccb2f7e5bdc98551656ebf53e9c7786b11dd9090be", 16)),
            curve.createPoint(
                    new BigInteger("4d5cc5414758ea1be55be779bd7da296c7e11f1564d9e8797ceea347c16f8ea", 16),
                    new BigInteger("1a680c4c410cf5ddc74e95ff2897c193edaaecce5b2cde4e96bbae5c0054eff", 16)),
            curve.createPoint(
                    new BigInteger("46c375c684b30adf4d51de81e92afee52b1a3847e177403372c82109373edca", 16),
                    new BigInteger("1eaadc5783c90a0261306423d52009e991126b3f620e9cb6cffca41ca096f4f", 16)),
            curve.createPoint(
                    new BigInteger("2ddfb71f51205888118cbabba8fd07d460a810289bfdeeb7118707e310cb152", 16),
                    new BigInteger("1fd905d07b3933be886f2518246bdafa6f33259a174668808223cd7c28183c7", 16)),
            curve.createPoint(
                    new BigInteger("386f3879960713d41fdb3b1e41bbebf26b1c0e27a9a75bb1adcc1a0d3e8547b", 16),
                    new BigInteger("2b21498c0f34ec6f17c720334dc0f36021c2f87afbbbc8847d0bd536eb265e5", 16)),
            curve.createPoint(
                    new BigInteger("407eae62c6c4de3b942195afec3f45efec71ddb5e6edee3d427631bcdbf9b90", 16),
                    new BigInteger("436e7f2d78268ef62c4172d2ff1469028bad1f1d0f97ab007064418e61caa8f", 16)),
            curve.createPoint(
                    new BigInteger("1b881175e21201d17e095e9b3966b354f47de8c1acee5177f5909e0fd72328f", 16),
                    new BigInteger("69954b1a9b8bfccf8ec384d32924518a935758f3d3662ef754bcc88f1f6f3ec", 16)),
            curve.createPoint(
                    new BigInteger("7d545a82bff003b8115be32a0c437f7c0a98f776bcf7fddb0392822844f3c5e", 16),
                    new BigInteger("34b6e53a9565a7daa010711f5bf72254a4e61da3e6a562210a9abc9e8b66d69", 16)),
            curve.createPoint(
                    new BigInteger("299b9fcd4fadfc4b6141457a3036aaa68501c23df579de26df69d4def89b913", 16),
                    new BigInteger("b95bf2c2bb303c38bb396382edc798ca6a4847e573ce19b7b08533d1912675", 16)),
            curve.createPoint(
                    new BigInteger("551f5a4dae4a341a3e20336a7d2f365ddd45849351ec6dd4fcbedfe4806d5d5", 16),
                    new BigInteger("5865c977a0ecf13ce85ae14c5c316872080bd36f0f614f56b6dfc7ece83792e", 16)),
            curve.createPoint(
                    new BigInteger("7a1d69c08e68c80ad8b310736e6247a53bcba0183b9b8798833bc696a0fb6e2", 16),
                    new BigInteger("3ce803a20ebb3b120d5eaf0ad64bed0522fad1a0f2ce39a5c5cbae98c4438f6", 16)),
            curve.createPoint(
                    new BigInteger("28acacc0bc41d84e83663f02b36981a2c8272ecd72d3901164be2affb09c504", 16),
                    new BigInteger("7a5aee0b160eaff5b5968ab1a0304ce58c3d5ae0148d9191c39e87668229e5b", 16)),
            curve.createPoint(
                    new BigInteger("1f78cfdbcc767b68e69a224a077468cdfcb0afd6952b85bccbdb96d1fb8500b", 16),
                    new BigInteger("4772ba173c6b583284eb001cfc2a124104833f464ff9df096443e10ef3e9dd4", 16)),
            curve.createPoint(
                    new BigInteger("2774108962ca9897e7f22c064d2ccedac4fef5fc9569331c27cdc336c95774b", 16),
                    new BigInteger("9e13d79b68e8dc8091c019618f5b07283a710ddf1733dc674a99fc32c12911", 16)),
            curve.createPoint(
                    new BigInteger("770d116415cd2c4ace0d8b721dd77e4a2ef766591f9ec9fa0b61304548994ed", 16),
                    new BigInteger("42165d93c82f687635aa2b68492b3adffd516beb4baa94520efa11467a209fd", 16)),
            curve.createPoint(
                    new BigInteger("5e6e4ece6621e2275415e1fda1e7c4f496de498b77c0b913073c6a6099394b9", 16),
                    new BigInteger("3d92ce044fc77fa227adc31f6fc17ef8b4ec1c5aafc44630c0d9195075bf56d", 16)),
            curve.createPoint(
                    new BigInteger("6e69c717b5d98807ff1e404a5187a9ceaf0110b83aa15a84f930928b1171825", 16),
                    new BigInteger("1ee7cfc3a9744d7fa380ba28604af9df33ac077724374c04588bd71fa16b177", 16)),
            curve.createPoint(
                    new BigInteger("404318f2d2ceb44f549c80f9d7de9879d8f7da4b81e7350c00e974ebf2daef1", 16),
                    new BigInteger("3934831b5af70d17a3f1da9d2931bd757e6acf2893236264fc7e0d92ff1a1cb", 16)),
            curve.createPoint(
                    new BigInteger("20dcb6f394fea6d549b2e75748f61b7ec03b6e52319cb14163373a9c22bb9dc", 16),
                    new BigInteger("106a8c96cfb95a331618b7416d1498554730499e194a58fbf63019890480fc7", 16)),
            curve.createPoint(
                    new BigInteger("119000f277ccee013e6bb121194ec1ab5460fb6a96eb702a14079865f4170aa", 16),
                    new BigInteger("1737a32f5415e8720a5606ec1dd4756f02e7c6817e3723b453d091f2d192773", 16)),
            curve.createPoint(
                    new BigInteger("45d0fb5cd95db76d05dec3faa12e467a308eabaad363a062353db3cd2d9b749", 16),
                    new BigInteger("ae08691b5b0cdd19ec499132421638f470f493320e4003d123ab1da761b965", 16)),
            curve.createPoint(
                    new BigInteger("1257b3e65cdfb6367c6d0942327e799bc66eb221e70c6573a9862889eb51c38", 16),
                    new BigInteger("593309fd45755dd2cc4afd2b9316bc4638b0c5ddb3009694fcb7b250d0c8a2f", 16)),
            curve.createPoint(
                    new BigInteger("186dcf9950f72e868014a8accf14aa36e82a7a2a29f86ba37f6632da4189db3", 16),
                    new BigInteger("55684c9f7a043fc523ed78f756f834b4db823d5e4161bd79602c17d55a5cd8c", 16)),
            curve.createPoint(
                    new BigInteger("58791d5569f282f5c3b01ecdc9388df7ba3ca223a2dc1eed5edaf2a1d302fb9", 16),
                    new BigInteger("6298d7dd51561a045bb4089deda9f40b2865589ed433e56d54554f8b45e79f0", 16)),
            curve.createPoint(
                    new BigInteger("13fd87144aa5aa4b24d5a7bf907d8280d15937fed262d41084898cb688fc28b", 16),
                    new BigInteger("3fa54367770cc4479a857411ddcabe86627b405ce1cd14ad3b2863bde13abe4", 16)),
            curve.createPoint(
                    new BigInteger("48118139445415f0c1879224e2dee744ed35280ff00537260402a1741ec3676", 16),
                    new BigInteger("4dfa39dadaabecfc54ecb7a25319444f8e952782d863790e42a9887064fc0c1", 16)),
            curve.createPoint(
                    new BigInteger("4ad031bb9eda84f2fe5d354c7948d41558ca657a04508654721810ee72ef158", 16),
                    new BigInteger("620ebd5d0086b92c6009a42777b946a351c2c7ba852b57d3c9905fc337459ef", 16)),
            curve.createPoint(
                    new BigInteger("4a34abb016ad8cb4575ea5bd28385d2348e5bcc0cbba90059f90f9c71f86e8b", 16),
                    new BigInteger("4f781829ad83f9ed1e1b6de0e5f4ac60dfdfe7f23cb4411e815817e705e52c8", 16)),
            curve.createPoint(
                    new BigInteger("7fc632d7512aab5356b7915dca854c8b12b369ab54f524fbce352f00eb9b9f9", 16),
                    new BigInteger("2ce80b944fc9158005f630b34385d50c3ad84450a9e1e529925b3211dd2a1de", 16)),
            curve.createPoint(
                    new BigInteger("65ed10347503cbc0216ca03f7536cca16b6abd18d332a9258685907f2e5c23f", 16),
                    new BigInteger("3be1a18c6bfa6f2f4898ebefad5a8e844c74626d5baa04a820d407fe28bbca6", 16)),
            curve.createPoint(
                    new BigInteger("1a8abba1be2e276cdd1f28c912280833a5ede1ec121738fcca47dc070dcc71d", 16),
                    new BigInteger("21b724378bc029a5199799df005922590d4e59cae52976f8e437bf6693eec4a", 16)),
            curve.createPoint(
                    new BigInteger("3a99c22dafcfe9004ebb674805736a26aeed7ed5d465ae37226dcbe270a972b", 16),
                    new BigInteger("5bf67552af08e1e6e2a24bf562c23225e89869cab9bef8becb3669175a3c94f", 16)),
            curve.createPoint(
                    new BigInteger("4a6a5e4b3501f2b7bbdd8da73ea81ffca347170bdfb6776a037cdd74c560fb4", 16),
                    new BigInteger("5af167ebb259c2da88740ec559ee04052bb66480b836cadd0e2590c32d7111b", 16)),
            curve.createPoint(
                    new BigInteger("6890d95308525f0bac9dc25cc1189eb92d29d4b3fe61bc8aee1c716ac17b1e8", 16),
                    new BigInteger("e6f23f78e882026b53ea4fac6950e56e3da461e52339eb43d2fdb2dade7ca9", 16)),
            curve.createPoint(
                    new BigInteger("748f4cf4f027efdeaed7c7f91ef3730ff2f2bb0bfc2db8f27aadde947f7d4d5", 16),
                    new BigInteger("3a1cbc550699411052c76293b8c41a3a8a1ecf12cbbc029a1b2b6ea986fca93", 16)),
            curve.createPoint(
                    new BigInteger("7321f3f581690922cd0dec40c9c352aae412ec2ccdf718f137f7786ab452cd3", 16),
                    new BigInteger("5be5130c9277cdb76d7409452438ec15d246b211dd1e276ee58e82a81c98fd4", 16)),
            curve.createPoint(
                    new BigInteger("6c4d6cb7e7ae70955224b8a912ff57ca218635a2436b36cee25dce8a5cdf51f", 16),
                    new BigInteger("32f8c03c6db3246946e432e4148e69f5628b200c6d7d72449df6eeac0998039", 16)),
            curve.createPoint(
                    new BigInteger("1dad5f2e795ea6fa5177f110989516eacf8fb37bd6a091c7c93f1d73a2fe309", 16),
                    new BigInteger("56b2298c538180e99dea3e171dbb5c6fba0bd0a9ed40537277c0c2373a8e2c4", 16)),
            curve.createPoint(
                    new BigInteger("1610605baacc9bc62c4cc923dc943347cfece7ae241e746fbe6c2c878221dbd", 16),
                    new BigInteger("431a82d657e0d109d00dea88cf3fa9b999845221b7b5590a20c40fc71368c1c", 16)),
            curve.createPoint(
                    new BigInteger("6a4f5c787fb09a5be2b04d2eafa1e6f3d3c863ee22960eb0b64f6eaf6659162", 16),
                    new BigInteger("14dbc3eaea6146ee7eaace5a91ed9430dad3a47e9ca2f68b455171f8fe6a7b3", 16)),
            curve.createPoint(
                    new BigInteger("738415b73e55412b0e582e45ff0d7bf4b1bf2922db581783fdcc75559f40e", 16),
                    new BigInteger("33825aeb3fd8459999eb418d15102ba5864b069c6ea517f0c6e9eab8d9aca47", 16)),
            curve.createPoint(
                    new BigInteger("2603e72ce53985c70782774057a17944f7b4ce224a809be4e2b5af3606aa1d8", 16),
                    new BigInteger("92822921809c42318f42dac4d773325f41c43069e990adac7818a45e2554dc", 16)),
            curve.createPoint(
                    new BigInteger("181cd967ab4615357cc96c82eae9152ce7598c1a1dfdd91a458bddb016ae9fe", 16),
                    new BigInteger("5d562fdaeb0e12647e230e50eaf216bed52fa73c6b7378821a3bfc4cd66d4ff", 16)),
            curve.createPoint(
                    new BigInteger("1121726069b9ef5954ba6490100b226e0be53fef3e071b7c58a1286174b789a", 16),
                    new BigInteger("4b25594cf4e9eb2d14b3f52f2661a9992234fc222c0a0d44517cb77deb9c16f", 16)),
            curve.createPoint(
                    new BigInteger("e543663969b915337f105f80995a77b356f1a51d8b4a4fb12d44364130e873", 16),
                    new BigInteger("34b2e3c009fdab4cb7349a580df2e64c0098a123280078e5da6623a9ec6b44f", 16)),
            curve.createPoint(
                    new BigInteger("4e2f8909bb62de5ef65600e61bbf969293815296b6e23702875e049b3ce5c45", 16),
                    new BigInteger("3cb81f2c21f22a7add26fa38a9ce5d9cce1bb251bd2698f90c34ff0a84f7af", 16)),
            curve.createPoint(
                    new BigInteger("37b546e403a1ba970c17b67c2f1361ab9c803f8d2b5cd93803014faa08861ed", 16),
                    new BigInteger("37079184ea46272f5809b523d060686633f7995167897a153be1772fd6566f6", 16)),
            curve.createPoint(
                    new BigInteger("27bddca77f7bd7f66b3693567a4238f2e6751d95b0bcb409f6b24d08f84798c", 16),
                    new BigInteger("6417a85cbfd6fc02df560d3963a241a986baacdfa423f65d7227ce49a96c57d", 16)),
            curve.createPoint(
                    new BigInteger("2de71a39aa043057d1bc66e45f804542acddf18f7a6d88c0d7fb0ca240debdf", 16),
                    new BigInteger("306c1ce39ab46300f7cca0f3a2fbfa77296a27e24bc66b0b8044968ec0ee413", 16)),
            curve.createPoint(
                    new BigInteger("307c877154364c0c03534e7327d5a88e1380ceef6481567ade37a14ee7c1a72", 16),
                    new BigInteger("3404bc7dbfb33b95d922d0693aaf9358f77888d7d95e773c38d83dbe2e5f995", 16)),
            curve.createPoint(
                    new BigInteger("79f09ff7c60850e5f5ea020722659a1ed27db4c95dca131f99552f785c8afbc", 16),
                    new BigInteger("40429528c099349b426ddbf129497176951a64a53db5f9d8bd2be0252cb22b2", 16)),
            curve.createPoint(
                    new BigInteger("4027dc6b56d446e5972f35464eeac85c5254ef377c902d9fe37aea841bb5292", 16),
                    new BigInteger("7c3ea37689ef679fa2f5c7e031a78e23d484a8317990fd34d44d95cc1db3717", 16)),
            curve.createPoint(
                    new BigInteger("645dbf78a3c228c4b7151450b5e65edb58e71f37e1e4bc5f471e0f1abd6d9c2", 16),
                    new BigInteger("15cfe7850f327b256e23b00627451560c5c6ab60db78d45b7ab286afb6f13ab", 16)),
            curve.createPoint(
                    new BigInteger("1503ca373757677ad1d911a2b599d01c46eb879d1ce21ae171c7e439846a85f", 16),
                    new BigInteger("583eb269b7030da6a0c324026919de3f9489d2ff6ae0e6320c36f05469ad66c", 16)),
            curve.createPoint(
                    new BigInteger("66e1819ba3ec4ad4ae9f7d7588d23baa004e29d3aad2393d52af204a81626ca", 16),
                    new BigInteger("505249980cbe6273b82ad5038fe04a981896f4117345ac1abcc67e2525c0ee4", 16)),
            curve.createPoint(
                    new BigInteger("5ec20dbb290254545f9292c0a8e4fbbfb80ad9aab0a0e0e9e9923f784d70ed1", 16),
                    new BigInteger("bdb1ca3a859227cf5d00eaae1f22584e826ed83b7ccdb65483ed5213dc4323", 16)),
            curve.createPoint(
                    new BigInteger("a5c1a5011f4b81c5c01ef0b07c0fbf0a166de77280f0ae241f2db6cba15194", 16),
                    new BigInteger("4444521fb9b33d7dfeb1247d0ee1a2b854ad166cb663d9dd2e686909362a689", 16)),
            curve.createPoint(
                    new BigInteger("1f35335de40e00c62642dac2fda8b30f071986ce4f11db849df11bc45ad4e0c", 16),
                    new BigInteger("7801a2c761b90fd4477ba0be9a775003d5dfcd959b1ed198b4681f15e7acbf", 16)),
            curve.createPoint(
                    new BigInteger("48db4798cf6821c1ffb8178b1d3bb6020e04186c96aaf4670972d367f4ed5f", 16),
                    new BigInteger("781019494df95b888f1578f1b4a3f8e125ea60eca47ef9207a10630671217a3", 16)),
            curve.createPoint(
                    new BigInteger("17f653d904210148a8e74d8e719a3061683c164aa6d79c902a19f185ab437bd", 16),
                    new BigInteger("6780e97985932c3860d810af1e065d454b1cb4be0e7ffe2d8cea7d52526e223", 16)),
            curve.createPoint(
                    new BigInteger("5c4d0c7432f9b0070436240f9855adae1467cdc9826952ae01b68cd52a3ad89", 16),
                    new BigInteger("1c5747f968ed91261b7ae9bf1023c999da9816e37de602d6a1a50d397752bff", 16)),
            curve.createPoint(
                    new BigInteger("6fedd7639fdaa2f7bad4ca0b391710f6f8a7e890250ae8ae4252bb8b39a1e58", 16),
                    new BigInteger("436a215f655a3fd3778b2335ffdc9aca6b98474e43d764c1f8362830b084f0e", 16)),
            curve.createPoint(
                    new BigInteger("7fbd45a889c5e9d127bb4f8474d6be7cb9796bbfff923b75e42a1ad4cae37d6", 16),
                    new BigInteger("484bd12622a6ba81cd53049c550d9ed682a8e765b656b1cbff9bbea637bd1f4", 16)),
            curve.createPoint(
                    new BigInteger("17d984d47937263f7966a3e7b1eea04071e678494bd749c9e02b48b3234f06d", 16),
                    new BigInteger("7b341ff08722c4e161005d0037204a7a2001fdda7af2cc1a0b04a027f115a0f", 16)),
            curve.createPoint(
                    new BigInteger("7f1822045db45ea07e1519c3ee1f7705915f35fe4dd8db1e8921b5d1c740edf", 16),
                    new BigInteger("33d41e06b93320ad1b3d9580380ec797a05dac3f1cc8008899110ebefde2f78", 16)),
            curve.createPoint(
                    new BigInteger("7b19453ecb74b7d0e2a66b9890ff73bfbbcd61a266abd6d82dbe665bf32f34d", 16),
                    new BigInteger("6dba2355420dac582b1f349609ea1c89b89bba2d1a68a0642f1dd12d86e73cb", 16)),
            curve.createPoint(
                    new BigInteger("273e82a15f395ddf2489a95685bec8bac62c4b459d1b28987d3cb27e4bc9128", 16),
                    new BigInteger("653375b48a4cf5d5b101c9ef533039bedce5dbeef3f59e8f168bdc99b06ca5f", 16)),
            curve.createPoint(
                    new BigInteger("3006c9e7fc6a553d8eb4e8a47ce9f10d1a39576ac255ae9e0a4ce3869e76212", 16),
                    new BigInteger("65fe9e2ef2aae608be309332d464f57e28f1df5de1a6a519751b056971f932e", 16)),
            curve.createPoint(
                    new BigInteger("5e8f384c8a4607fbe9789fcc52d54249d304d698562597d114c1d81452d3dee", 16),
                    new BigInteger("3c8bc78066b5d947dc1e405e326ee55ea606c7988f666748d259850fa259a22", 16)),
            curve.createPoint(
                    new BigInteger("7841b2102e9aa103fb53a642b3e167b21113ea44751ab38e0b5ef8312654db9", 16),
                    new BigInteger("71bf5c8308fcf9c4a7847494cd9bdd946fddf7d3a37e8bb0b201ff2343deb8e", 16)),
            curve.createPoint(
                    new BigInteger("40f68027420c11e3ade9aae041978dc18081c4f94943463aac92d887f922a62", 16),
                    new BigInteger("499c6062594a6c7e21a3cb91ea451813393bff365a27a08f1a515439b83cf42", 16)),
            curve.createPoint(
                    new BigInteger("6ce77a50d038b222634e87948df0590b79d66087b01e42b9b6d8fa30ebb1465", 16),
                    new BigInteger("35f5c46bb1be8555a93f155a174d54ec048c2ac8676e7c743054ddc52709d37", 16)),
            curve.createPoint(
                    new BigInteger("604f8b9f2dacb13d569262864063c2d4bb2b2cd716db6eeb2b1eeabc57746f6", 16),
                    new BigInteger("68c6799e24f3b44eec3049973445174727a66970f1614a782efa2b91ab1e457", 16)),
            curve.createPoint(
                    new BigInteger("73d620f3bfe77f672943d448d7dc05327adf64b8e7af50039c469d7f7c994c4", 16),
                    new BigInteger("4859deb36eaf0c802f0d1514602368143a33ec6ce8fd55248b59025debc6afb", 16)),
            curve.createPoint(
                    new BigInteger("3fd2bcd1c89d706a3647fbd354097f09c76636e93ae504973f944d8fc3bcc1", 16),
                    new BigInteger("677ef842cf5eb2444941f527abec567725e469469192354ad509a26ebb3d0e0", 16)),
            curve.createPoint(
                    new BigInteger("39222ea924ac17b533c72ffb2c47ffdc11d6a7f7c70fbde3a10fb0b8f35eb2f", 16),
                    new BigInteger("20dc4bd1089019bc1d7379b4feb3eae6eb5af59e9f253845da9fd633057e952", 16)),
            curve.createPoint(
                    new BigInteger("326f58994e1347f62e4102183215b5db956378d2f61f14aba4dec94577f53c", 16),
                    new BigInteger("7a03284c296003bbe05178a1d82efdb7b8125511d63e20e50aed789c2e52e1", 16)),
            curve.createPoint(
                    new BigInteger("53aa8939c74d4ee58f03bc88bace5a45c7bfcf27466201da05dc6723a5f5632", 16),
                    new BigInteger("2e32535ca7732904a048183247b04b426ecf9b39fc393a9cebe92fb1dc7a7f1", 16)),
            curve.createPoint(
                    new BigInteger("6cee1a03145e93b3e826e6067005f09c06099c98198c91c222407ba5c8c132e", 16),
                    new BigInteger("beaecad1274e7c6e5476a100c271aa1a6f86ee5a9fa5c2f26124d5886fa63", 16)),
            curve.createPoint(
                    new BigInteger("3ec659b8175e1be1bd5a252108714776b813e330393f587814f5f1f32a73332", 16),
                    new BigInteger("529a5cf9f8c237ae69a94217d173c8d19c156952041f5c980da557990863fa7", 16)),
            curve.createPoint(
                    new BigInteger("3d66ec5963d0c534d4139c8cef2e1ac48b3e7965fafabf58be26f903318af4e", 16),
                    new BigInteger("3d3f2de7a95f59b683725ee6283cbaf31f97c4b600df9a4621413223a468740", 16)),
            curve.createPoint(
                    new BigInteger("7fb38ace8e0932fac2ea0d3eb676db8d684db1817e2e4d59da7996ce398b4a", 16),
                    new BigInteger("68f92bd5768cdd4710249f9d49ef1d5654e497b9a4ba10bd2971366d83fb400", 16)),
            curve.createPoint(
                    new BigInteger("1c4a49314d6b4969cdd142c76ceb7682bfb868ace7f7568b0fc8635bda5a9fb", 16),
                    new BigInteger("5fc0519f1f4cc10b5771312458748c036313b87707ed0540026ac64a5955aa9", 16)),
            curve.createPoint(
                    new BigInteger("3073c95d08d3b97caea5f0be16b2789bee766f76b7e5499f8ce8f96abb0f344", 16),
                    new BigInteger("52a8974b4eb9a1f6a0ae2c83cb4715bf18d73f057255fcb3f63b74f7e78f590", 16)),
            curve.createPoint(
                    new BigInteger("44485b16d597a5de3604df6f7ed7e00b8aeef9e7e8dea8688255153b8bb16aa", 16),
                    new BigInteger("6cccb0ba170123266f24b5d93a744397dc2c44820edc4f8f5b9a0f5c9b3b940", 16)),
            curve.createPoint(
                    new BigInteger("7618f77b7b32d512688dd62e0b48231d9574c6361e8be353a7dc04f7c3a115e", 16),
                    new BigInteger("78ffcd16d80636381ca231aae70d99c9e20298b4f5388fd823ea9fa2b8ddfd9", 16)),
            curve.createPoint(
                    new BigInteger("7dc82fee1ef95cf5b3720fcc07f63246654bfe39762627839da40e51c75654d", 16),
                    new BigInteger("4c0ccdd70955da74558de20c88352df8a02aa97e4d5971c500e884740a8cb62", 16)),
            curve.createPoint(
                    new BigInteger("7fa5d460dc10cbb418b444d9bde97e92c70a99a222b99f244dccee7e62cc04c", 16),
                    new BigInteger("636163901baa5b7576c38c43407af578b8c4607e01e86011ae2dde587a89f84", 16)),
            curve.createPoint(
                    new BigInteger("758930d46006623a756c89bd0cc378f6a3c1f43c9a0edbb42274c35e75c16d2", 16),
                    new BigInteger("1d74dd9f81c2fec811b8cbd6168a745b0a111932b2a345265ef2853b50b6245", 16)),
            curve.createPoint(
                    new BigInteger("7332ee0626b044d664ef228f8cb84df7c643e52f6a2591ae1c9007ad61ec16e", 16),
                    new BigInteger("229bd8e630572cbdee54283234cf3e9f060e6382f99943bf234119d47b54470", 16)),
            curve.createPoint(
                    new BigInteger("78a16ef803aa20a075bb2f66c61bb2dae5698bebb94a0995fa74c3d53de1614", 16),
                    new BigInteger("246d588b68edb6fed96c128349908c42dcd64c46341b205e79f4aed9b5d3675", 16)),
            curve.createPoint(
                    new BigInteger("6e1933939bd03b67bba753cc0cbe7d2f25bad68c993887ef8c9e2fcd59b0647", 16),
                    new BigInteger("599413f7c204a11a5ce315eab11299ab7326603412bb00bc1c59ff75a37d6b4", 16)),
            curve.createPoint(
                    new BigInteger("4a79957a5a1888ad063b51c69565a2b48e8eb917183e220a1c8d3374526d30e", 16),
                    new BigInteger("1f092de0e069bba7fc5386e2e9a114c1618f88c4b95e220cd35ffe96f99fcad", 16)),
            curve.createPoint(
                    new BigInteger("3148aa3df9ece39aca84f59489f2710522216f14be6055ee0027529d1d55e2d", 16),
                    new BigInteger("617e9a52a92975db0ba1977f71116f7058a0d31b869ac7f3ee2fd80b0c5100c", 16)),
            curve.createPoint(
                    new BigInteger("5c1188e72384160ae39d07328346cda4f6c12d227448e6236f04dc971625287", 16),
                    new BigInteger("1643006eb3a3bc6aafd5f685cf054f2a572e6ca58c0118bcec0b833741f116d", 16)),
            curve.createPoint(
                    new BigInteger("3f72efc93c9b71adc4c51d8fc69d3940b20d08733af2b7d05140fdb1d1c1004", 16),
                    new BigInteger("7399259987c8f4ebfab46e522380707e58427d3962ee0c2a91760813f76d232", 16)),
            curve.createPoint(
                    new BigInteger("3129b34c03c51aa8f611e91d5cfcc9bd3ef108ee66e6d3ee35a0e0e50055bb", 16),
                    new BigInteger("563b18b5650085efb4cf179a029e6afff27b1d3091cd28eaa68d24fa1f801c6", 16)),
            curve.createPoint(
                    new BigInteger("16eac0f9fb4c67cf89a7fa4ee615bbe731d8edcb709a1b9b50c7d873a530f52", 16),
                    new BigInteger("7ff8288b6e199ca8f316192881424a37fb080c29daa76b1f0edaccaf580a80e", 16)),
            curve.createPoint(
                    new BigInteger("75f6b6028c43ce832f65d7e8e620d43b16cba215b4b94df5b60fc24e9655ee4", 16),
                    new BigInteger("35e9ccfaed2293a8b94b28de03bcb13eb64a26c831e26cc61a39b97969a2ff0", 16)),
            curve.createPoint(
                    new BigInteger("3c6152fe093bd6316897917ec56a218640ec1b2148f21db9b14fc7a5ff362e8", 16),
                    new BigInteger("6eef2df27ae7d63a28856b07b73e7aad7ca94f317201a1e675ffc6f9a1710dd", 16)),
            curve.createPoint(
                    new BigInteger("54e01b5fe4fd96052aad55b3f26b1d254dfc7e2525fffb9ae0a77eb8cc5579", 16),
                    new BigInteger("7c3d39232ab333675b219abc766ed9b4782c840e6b046614dedb8a619696eb0", 16)),
            curve.createPoint(
                    new BigInteger("d1e63f8ea8a76429cf254a6d3b668761f0dc572d4bfac4fd56d9eaf58fb6c0", 16),
                    new BigInteger("2bd0a84d3908a63085824c9329a0983913006ba155b56a58eb3f9becab29c45", 16)),
            curve.createPoint(
                    new BigInteger("2d6122f2a702edd4da7385b1580796a71d13bd72be94cfb3fec01149c006c2d", 16),
                    new BigInteger("70eb282fae992efa6f5915e578b640653549f23385ef3a29ab29b1b9b8ad63b", 16)),
            curve.createPoint(
                    new BigInteger("752fec14beaadb5ddbba6b3a17fcb86579fa588ef407fad0ea07dbb22a640d3", 16),
                    new BigInteger("3feb6728eca21a1e84e8f9f23010387a53a96a1cb62d86fb37996150a1299ef", 16)),
            curve.createPoint(
                    new BigInteger("63f94a92f27acde8f5ed949b459506f51d70c85bcc61a34d647264ecc53c65e", 16),
                    new BigInteger("37e5dce0646ee66f4fdb93b82d54d83a054948fa7d7fa74ab6b36246fc7383e", 16)),
            curve.createPoint(
                    new BigInteger("d6aa909287a2f05b9528690c741702c4c5f4d486c19a46c38215f52ef79c7b", 16),
                    new BigInteger("5ebe1128dd81093df4aca0df365d58adab848d1be1a94b95eeb649afd66a018", 16)),
            curve.createPoint(
                    new BigInteger("12866812b3053e2f7a9572bdaf5ef2b48c6fb62a0eed9ff0356df50e7d05557", 16),
                    new BigInteger("6785f7eb2cd1c120e4c7167b46861d10117040a2e9f2ca86a71e9d67df90613", 16)),
            curve.createPoint(
                    new BigInteger("46a730d05330b1b13673cb8a1b8f45460035e4a9f1a1751cfba099c4355c1c", 16),
                    new BigInteger("76fb0ec6cd16a8141cdcd875c8b2de9fce42d296072643d148ac7e7fa7472df", 16)),
            curve.createPoint(
                    new BigInteger("4bd4380a22900bd34835e0a908eacf4b6edb61eda0cf483f9212453b37e7516", 16),
                    new BigInteger("5e9551cd20d8d7ddbf4366880b7d5267385afa1966ff30da4baaf273b009d29", 16)),
            curve.createPoint(
                    new BigInteger("71f1994ad40baa2922424ae222663a64f93d8b67929e9a10f9e4c1ab19f3833", 16),
                    new BigInteger("85320fe68ec0d37cc19fdfd03589d66906ffa4046c80e1b094a85f27676346", 16)),
            curve.createPoint(
                    new BigInteger("5a63b1bf5232f28f808765c6be7ce1f81c52145b39f01c879fae0f4303bee61", 16),
                    new BigInteger("3bc5d6df68bb6d0577bf9ae2ae59ec0e9b2dc7dd56ea179fb38a41e853db950", 16)),
            curve.createPoint(
                    new BigInteger("161ded55ff1087032381e6c1449704f63ad2d88df82dfc44a71890fa09b3941", 16),
                    new BigInteger("78a52e0013842037274ea75daaf8eb4afc04ccc4b07bfaf3f5ee47d165e01b", 16)),
            curve.createPoint(
                    new BigInteger("1bfce5229c5fbff5c0f452a22317fcfcd9262f23df41840f84fe7d44cfba1a1", 16),
                    new BigInteger("66b387872c00e63c73006a955d42cf49c46c5708fc9d1579b9ae38341b24a3d", 16)),
            curve.createPoint(
                    new BigInteger("56d47dadc9cbd1dcb2ee3efcd5d4af5e6aea71df10815c68b54a14e81d11b44", 16),
                    new BigInteger("47e966ba54df48e9b612a903685e0060a67e4725402e8cb4cf654e54e813a3e", 16)),
            curve.createPoint(
                    new BigInteger("4b1c44438afd4ddf20a2cf612df2ee494ce84c7274c5529e857693e73018491", 16),
                    new BigInteger("430403bd31d8f0677e06abff7159384560f27b9622943fea1a3192f14bf40d4", 16)),
            curve.createPoint(
                    new BigInteger("7f7281728fc2214aa1dbf13176a4624b53814734abd570eb6ef7c7e32379606", 16),
                    new BigInteger("312da47be347fb3fa2c9089b38df372560dcace2effeeacab4d96ab11567295", 16)),
            curve.createPoint(
                    new BigInteger("16a28884a1be8183e0d3fc0db84a9afbf47126fd3be548c2a584aaafbfa7dfe", 16),
                    new BigInteger("7c3f57b3b895564ba562c1cd80b71fda6d2e611665c6ab87744f5390858fe24", 16)),
            curve.createPoint(
                    new BigInteger("323339f37b327a731232a9580e79952063c7c232bd1380146d8a83c285f4b8b", 16),
                    new BigInteger("4f16be1d983c7232f92cce6b9690695978d42cecc8eeb8c206e125d1098a265", 16)),
            curve.createPoint(
                    new BigInteger("624d26cbaa197e104eb83cebf2adeed09a5cdad359993fe5e3529d4d0def21d", 16),
                    new BigInteger("261b7da3cfb55c788977e0d8d640e3e93ae5a325d962ce85c816d7d32cfc430", 16)),
            curve.createPoint(
                    new BigInteger("f24ecb7ee83a3e28dab54a330dc93d0429a7aea36412e922dce8fbff40d60d", 16),
                    new BigInteger("b043e36a258d1df1d21b0cc7be9c4dcae1bd4ed326c110e668ac23d86805a6", 16)),
            curve.createPoint(
                    new BigInteger("686cea46b710bde1231483bfdbc700cfa3da6ecd5841c0e0c782f9ea24328ec", 16),
                    new BigInteger("7eb7407aa58edd6911c7c7e8d1e03bb52ead4a2415a0c33325872ff3a521dd6", 16)),
            curve.createPoint(
                    new BigInteger("3866ee1186264549df3dfcdf8705c0380c9372eef6d4081c2454d3aded1720e", 16),
                    new BigInteger("634c6d3e8eb8af652a4be73e3b613452c2213104ca875b66b4b15ee5b1716af", 16)),
            curve.createPoint(
                    new BigInteger("484c687cd2969a1d20a58cdfb9a60f280a473284503b1ecff5de514aaf8206b", 16),
                    new BigInteger("34d44d26b7427e51a646d1b924084762f5b461685450f21d6a472de565bebd8", 16)),
            curve.createPoint(
                    new BigInteger("203561333771fa0fe22c4033349f7b877d15b0542a5598e81e067968768247a", 16),
                    new BigInteger("2b6a533aff6e2163a36a2a89cb7415848bef48db40f952ffd380f47676707c2", 16)),
            curve.createPoint(
                    new BigInteger("2ffa6cca6233695760251206fc5e34c8d3692498589478cdd3d5b09f0b7c05d", 16),
                    new BigInteger("6c57d605478fa9626c4ed769554d075daa53e1a1d0bd4d94174d3bfeeb11ad6", 16)),
            curve.createPoint(
                    new BigInteger("5dccf0fa46a5571f204d0b033b45f299cbb3d9f80fded57253ea4f1c64faaef", 16),
                    new BigInteger("30a38e131ee8756ee5ea2a3e16618a5dbc28b5b9311308bf037ecc2039dfc7d", 16)),
            curve.createPoint(
                    new BigInteger("57b0a2eaebeafd950221facdd24790d7d1ab8883e5c5d55635f0d14a1ee4741", 16),
                    new BigInteger("7b41cc478fa6be38417271db8ed12efc0da6982552c1496025d2df0576bf4ad", 16)),
            curve.createPoint(
                    new BigInteger("611b5725101f611c387ccaa13889ecf3bb5595071a179ce350029bfca4ad7f1", 16),
                    new BigInteger("3129755977abc8995fec7eec1123a1561e429fde37ff36af002d3211831ecf4", 16)),
            curve.createPoint(
                    new BigInteger("1c06bbd0c52fdab9fcaf680c7a93fb821e538a2ed79f00f3c34d5afb9ea6b31", 16),
                    new BigInteger("3873d3bdfe0be0157bbc141198dc95497823cc222986d24c594b87bd48dc527", 16)),
            curve.createPoint(
                    new BigInteger("275cdbabc989c615130d36dabfa55ca9d539ed5f67c187444b0a9a12e5b7234", 16),
                    new BigInteger("2b7f723e68e579e551115d56f0ae71a3b787b843cc04a35b9f11084b006521", 16)),
            curve.createPoint(
                    new BigInteger("6cc702eb20f8b5940c7da71f8b1801f55c8c2d8e2e4a3c6c983f00bc1ffdd95", 16),
                    new BigInteger("5d15b3727bc66f3aba6d589acdd139fae115232eb845abe61fbdfc51341352e", 16)),
            curve.createPoint(
                    new BigInteger("44defb418700cee8c9bd696b872adb005490512d8bba081f8f99a9f15cc981c", 16),
                    new BigInteger("3b2072cdb1d919b2b65b5cb3557f0a3381d7ca293c267ca4a38f83e77bcc96e", 16)),
            curve.createPoint(
                    new BigInteger("fd83ce77b1578b3a9b8c3cbeaddb1504d2fd4a19c901c21ac65961224e4966", 16),
                    new BigInteger("110cbe64fc10c6b9c66f15ca406a35f50b723b35d83c5eb9797a57f8395f4f9", 16)),
            curve.createPoint(
                    new BigInteger("9dc6ff90e341875e113bbfb507724dc7095a280d2f32cb6ba61a1e0c2d2aef", 16),
                    new BigInteger("4aeb622896c852c2747454e8f172c9482955a42ecbe522d6ce07ecde79d0a51", 16)),
            curve.createPoint(
                    new BigInteger("71c58b0e47b9dd9107ebd8a8c8fa9f0534e78231bac612c1ddc7a94edf33eb7", 16),
                    new BigInteger("7f90edaf4792bf8334adbaa0f4ee7c654312725af188682d75f34874c4eccb9", 16)),
            curve.createPoint(
                    new BigInteger("1f6de1f14988778ceb2dfe844f92394f1f1e72fd1581ceb3bf336c95ce50345", 16),
                    new BigInteger("4f6007ed4e022d2ee9fe4ca8207c5f6c766c4f3b85260e941fb24ad0dcbf0bc", 16)),
            curve.createPoint(
                    new BigInteger("3ddc3ac25ede4a67a97547ed27dc920239b585fb3624177e2e8d59eba678115", 16),
                    new BigInteger("a9afd8f8bb759cbd1dff2addc63f47da4ba1291ea34229c09c0637dc5c8d24", 16)),
            curve.createPoint(
                    new BigInteger("c56b0269d8431556e471cab9d70edda3a37b391696f107b2dc370631de51d", 16),
                    new BigInteger("729c52f6b134f733eb750c14bd9f95c077f0f6f6ff4005701e5bedc6544599d", 16)),
            curve.createPoint(
                    new BigInteger("44d32ce19ac6807cb22e4f25fe1486a36a13926f147fbfa054b63ff0446177d", 16),
                    new BigInteger("212a21e8c124c9cd37c80d2dd66913ceaa6b6f666522f115c39382b2d5925e8", 16)),
            curve.createPoint(
                    new BigInteger("35dfc16f3ae6ccc06a267bf6d931601e52f3e45359ffc513570b65b96adc4f", 16),
                    new BigInteger("74311d10f4bece01b5ae65a6affe5c931463aa1b73a3320eeb41bbb7bb1ff62", 16)),
            curve.createPoint(
                    new BigInteger("e0acd9d2d907031b319b80121dc90699d003d220ea785d50e5033cdb3b1a03", 16),
                    new BigInteger("3911ba78d6e507485d6374b0f7d2e6198f6462a7d6d3cf046404a07af690357", 16)),
            curve.createPoint(
                    new BigInteger("3c57918ca254c0cb7dac251ef4e10c7d82327969552eae15d26c4c52660922a", 16),
                    new BigInteger("5fd5f5ff3f14e671548074114c72c48409df8a2e71fc8aa3c8acb506e2a88df", 16)),
            curve.createPoint(
                    new BigInteger("222ad8b61e219ba2b581f606b7c996516850a46a3db72fe1f72b5a9be6c324c", 16),
                    new BigInteger("72015a5e2db648112abd284fd867b59fc5606645177d26cf6e9a655c9912d42", 16)),
            curve.createPoint(
                    new BigInteger("3c86d5d774bc614469768ad38f7be9a53e9a233942c5c553b82e49aae684764", 16),
                    new BigInteger("480febea8229e130dedffff89c11f3c43e11724e6bd89d5566d78752859d41c", 16)),
            curve.createPoint(
                    new BigInteger("adb73bb8352d0c10175df371f7868ef2c9e0c79ac788430c480c0f7d85c187", 16),
                    new BigInteger("60b564785248111502e6f39c4994d6293fac22bc25f4d764b2fb1957d3c9bd8", 16)),
            curve.createPoint(
                    new BigInteger("3836ab8b46cf4f453a22532c886940b982029b29c42adca90ded5bf77e6bcb9", 16),
                    new BigInteger("7b15e91d6355f147b171a90b064a9d8b2d7bf3699bbf4987664c61c950d8996", 16)),
            curve.createPoint(
                    new BigInteger("12ed96af1a97c45ec31f1531e96f6fb28a03ba52ab8484545fbe0dddc97bb32", 16),
                    new BigInteger("6d1f522b6c6cad0940cff8e23decc72bb8d4164696af031415508b025aa8be1", 16)),
            curve.createPoint(
                    new BigInteger("27382994ae5878223ef802e9b4882f481a1b4008f1eec8484483471f7aa742b", 16),
                    new BigInteger("c31750d242b3975b0026a0e86ccdd17d0f680a8c6f53f197fc25eb1f777917", 16)),
            curve.createPoint(
                    new BigInteger("431677eba3715455bc235557518a74f3b111a88844ef13e159ad44bc16de3e6", 16),
                    new BigInteger("30000e1eb6a17d9df776981e65c6e500fded1ac12003adc9446b269812c9197", 16)),
            curve.createPoint(
                    new BigInteger("4b563e6f42589671579eabfa2cda5502b361c46a5ac8d45c8ed44741a925b33", 16),
                    new BigInteger("627bdb41678443fdd1aa607709e9699b652308615f4bea760a3b79ee0d9ab5c", 16)),
            curve.createPoint(
                    new BigInteger("2932fd3f81fc973ca9def6b7f1bb50f980fe589187cfe9e9f52ba4d356cf2c8", 16),
                    new BigInteger("1e6bfd00fa976c4770263a227048214c38850fe0f059e7b3d2c7871ef07d68f", 16)),
            curve.createPoint(
                    new BigInteger("e44e4f3d96d9dec775b996be57e57fdc28e7c68023109b221c414a244a0dbc", 16),
                    new BigInteger("58b1e52fa274812e5184e00e9ad812bec2463140adfb4bea3b2d665867dcc9", 16)),
            curve.createPoint(
                    new BigInteger("7fcb89be1f4bec745887bb891e53fefd665c53d00a9e74de16b8a7e1f7adfb5", 16),
                    new BigInteger("74af0b06633f779897e199609c71cc5649bbb65bc2c0abd4c678f0480c198d1", 16)),
            curve.createPoint(
                    new BigInteger("62a381ffb904ea3ff4d451d4c8459457cdbc3dc2fd2da646a95d8c1e90c0b7b", 16),
                    new BigInteger("1ba058658e09db9e319fa73de8ab4a992b71e4efc22c273725bdcab84e2a315", 16)),
            curve.createPoint(
                    new BigInteger("1b0fbb7a84c67e668450a54449c7a46261a2d355589f8b84ebfbaf9a77ee938", 16),
                    new BigInteger("44f8fffa33dd33a6146c35d196595e22cc4a215f61ee9197cd751400970a1b", 16)),
            curve.createPoint(
                    new BigInteger("78fe920bd96a356d4d95ee34adafe8fecf071d3107c36f047b4024ddc4b3eea", 16),
                    new BigInteger("6162f29607fdbec10181fbac6e57d5cb41b922c5791fb24bd28bcdd75d16c41", 16)),
            curve.createPoint(
                    new BigInteger("5629b849e026e65d119ac11821d7ab7efd9c52226f75c7427505d6818bb0c8d", 16),
                    new BigInteger("1539c0f90970ee8b490e45bbe5568170e5708521a0e59f976be680595906feb", 16)),
            curve.createPoint(
                    new BigInteger("62bc853f349bac8c6e5921d27ba85dbd9ba20a375d70a7bc008928f3e123b04", 16),
                    new BigInteger("6acfeb1de05ba43c3ef1a9110a983a320e77b3ca294abbc04aeca19b194f26f", 16)),
            curve.createPoint(
                    new BigInteger("4cf4bed663464418285cbae359b5d84ec76b5997d24f3640984c7663421190f", 16),
                    new BigInteger("941f818e3e3e8fb1568da85217d17f9250ebc948379014d900a7b1a848494", 16)),
            curve.createPoint(
                    new BigInteger("52ff3d9ffe9a302f6dfaaf74bab57c08027d5cb699a69b30830540c0a2d47a1", 16),
                    new BigInteger("987dd8876873778d933fbfed37aab2f7d6f669c37024f926b1edcb2ca55782", 16)),
            curve.createPoint(
                    new BigInteger("1109ee32f0bc53de6bfa457060b366e909d7c18061ec9845f46ac715496897f", 16),
                    new BigInteger("38f36f172bdfd454b9285f86e6bdece8fdffc95182c7d801b03c671cc55139b", 16)),
            curve.createPoint(
                    new BigInteger("4b4482f1d84efe23dadf3bb10df3dcaa251312dcdd604f616f1eb540e1f3232", 16),
                    new BigInteger("7c9c149dcae9135f940fb54482f9c3cd8193721643a6e23157b8020410d439c", 16)),
            curve.createPoint(
                    new BigInteger("69cb459b9e415b7581ca163611c470d875971d5d7949de732d1f0f200544a73", 16),
                    new BigInteger("a7136fa9dd00c0469863b7def3f83a5611ed628810d7e807e7a873da5a9897", 16)),
            curve.createPoint(
                    new BigInteger("b66a4e32ac9a4baa8f64780acd94ed3628b2b0ea874ba4dece629af65f9e62", 16),
                    new BigInteger("24328ba9996a24389658e3467b8b90dc3927ef8419fe28b3f55b1c1aaa51915", 16)),
            curve.createPoint(
                    new BigInteger("5ecc3080062dd451236de0e4eb91c5c75100733364bc5469f5fa76f79021ecb", 16),
                    new BigInteger("6da4abb9031a27b5be94529324fad8026e7d871570780081b0f424d4fe543c9", 16)),
            curve.createPoint(
                    new BigInteger("1e3146f00880bb22486d5bc73e54367d54251f4002bcf342d0393b05a4b9ce0", 16),
                    new BigInteger("23b6fb8e945d3205f633ba724202db5a99305f807137edf942cd60eef867699", 16)),
            curve.createPoint(
                    new BigInteger("2e1da8013285598b899f026c6974185db12c97b4c63509769d3d4ad1d18a4e5", 16),
                    new BigInteger("1e7e7b668674d1593c39d58bc7bccbf568208732b3519bc2cdf93db34366862", 16)),
            curve.createPoint(
                    new BigInteger("d26c3f389d81709506f184b53871497c8d36c5c9eee8e3737358204c1acba3", 16),
                    new BigInteger("34649c3d39f3b825947fedbca215ae30c5a5995e93b1c8efca4944cf85a082a", 16)),
            curve.createPoint(
                    new BigInteger("91300478a83595d548f32f259033291fc7d083953b0b8bde88c7559660c563", 16),
                    new BigInteger("e5d2bff57fc6551e9b80c06ac7314a71907cdcc66ce82f2cce721a670df10a", 16)),
            curve.createPoint(
                    new BigInteger("1f7abcb9d462c63ffe92aa56619ae8590089cca4d93ee3e5f34a63882452cc7", 16),
                    new BigInteger("7e9f85c7b7ca6e9a4f3a026d1048adbeef69ea9d876c6f647c257b879a81bdd", 16)),
            curve.createPoint(
                    new BigInteger("4d2caa1323012e4c83b0ad387308b8aef5637bc35ddd882e7f5e41cf2ca410f", 16),
                    new BigInteger("47150e808c81a540b6f8864e9d6636589cacaa516f82caaa96506edfbd6f0e", 16)),
            curve.createPoint(
                    new BigInteger("3c10a6083c38351deb3e6d1b386827d0acf48979b66b95249eb8700ec26b069", 16),
                    new BigInteger("47e34bfe561d903cffdd1d849b85aa3cbd31cb4a9bbd8cc2e5fd2f95016cabc", 16)),
            curve.createPoint(
                    new BigInteger("758bd54868eec045d0b4d3d2bc415d24bce13fee47cefdfda46425c109b657", 16),
                    new BigInteger("3392a7c66ea3bd7b044680bbe9f78ae86752097404c067e9d2572f55330df83", 16)),
            curve.createPoint(
                    new BigInteger("19e718e0ca1d2d6fadbc6006ee7dda7a385430e29f5e239cdd4bb7c3fdcb2f8", 16),
                    new BigInteger("5c68249b7fe03ea2e13481a63b6cd4bf74ce42009a89fee0b3f8f968b3ec709", 16)),
            curve.createPoint(
                    new BigInteger("28077f57ea62401806367e6d54fe45d02de5b072db787ffdcc3854e12a3e855", 16),
                    new BigInteger("14f3762689072f5fb41d03e94b01808c739f6d42b7b785b0e464100b150efd2", 16)),
            curve.createPoint(
                    new BigInteger("3b8a8cefd017363ce867265af3293cec081fa589fe561830f0078778cbd338f", 16),
                    new BigInteger("69ccf2383cb7b4f9c806d72535812483e7c5e9a1a5928529d64ca7e085e758d", 16)),
            curve.createPoint(
                    new BigInteger("77878f388d22161a2953e5aca6bac1ea480e102f329574b4b201640d44a296b", 16),
                    new BigInteger("7eb35706a90a03aff7c2fecca72659136547cee98038746db5aba16fd7178df", 16)),
            curve.createPoint(
                    new BigInteger("97332e6da70961f2ef31b7b628f1018d21db8db015922a301fca7d6fc6a8e6", 16),
                    new BigInteger("2e37b06f639fc7a82601b744570a2619e543cbfaf60e474107fcaf4686d3223", 16)),
            curve.createPoint(
                    new BigInteger("a81518d452d3aac48bf0386c3ff170ef4e684a4def242c964e129c64f4d647", 16),
                    new BigInteger("37506e44c85908ec7b7adda9547fbdcc2e3605151fefa77fbf127ce3bc938f2", 16)),
            curve.createPoint(
                    new BigInteger("e80336b2220b1d666074f6b0dac85353d0e4c2e8bd0f37055a2236a6a9fadc", 16),
                    new BigInteger("1cae76d73eda7a5964c5d9d3ad6748aff51f5543c56441d2fdb7b444a39846a", 16)),
            curve.createPoint(
                    new BigInteger("2c01fd8430ecb44e066f352c4f697fc9fda177dbe162f82862d7b9ea8c918de", 16),
                    new BigInteger("6e1dfa99640fdf5b30603d34c7c97c1aa6e6b7f3a2c52a21fc64b0fcac7d591", 16)),
            curve.createPoint(
                    new BigInteger("744e37b511cd0ddcfe15f3581947014c159de81ed055d15a13c7a2d1fa39f0f", 16),
                    new BigInteger("685caa8ff6979a6c63640ac638a3f9c75737f2031bd55322a47384357af164d", 16)),
            curve.createPoint(
                    new BigInteger("40e627ff84e1a7a9068b4368770f5956128a4d9e9e33e9cf5e24d9a242149fd", 16),
                    new BigInteger("2465bd6cb20bbdf810e2bc5c3c458cecf4f3aa163a7ac99c2579e5f33417f2e", 16)),
            curve.createPoint(
                    new BigInteger("5f635af7f554a17bceb6ccb6e637abf89ab6dadd399189b0a0390e87b1896bc", 16),
                    new BigInteger("2aa6238a69f89665646c0e3ca2ba5f709cc6e14351cf71e1b00ec45201417a2", 16)),
            curve.createPoint(
                    new BigInteger("5edad3063c9fa8305978d7e6a4e037c9fa519b8023c7608dfc3b66e5c1e8985", 16),
                    new BigInteger("49f405d07d7d01919da51159ecdad1031a5ac208c026fdfc14d38f633d92183", 16)),
            curve.createPoint(
                    new BigInteger("2fdf2e8a45858c12926a1f25a62255fb2d02d0149a15ef669f859806683e649", 16),
                    new BigInteger("61cfb686bb31e2524470d4ad2ae09e3cc91b16305a21d748098feb1d8ce3b3d", 16)),
            curve.createPoint(
                    new BigInteger("ecdbd7c37f1dffa3943977278da3bb429afdf948b4ea6cdebace3d3be82381", 16),
                    new BigInteger("190b67fb34f7f3ad6afd3d6b6427aa327547d8ac0fb4deeb0feeba1f63d6c60", 16)),
            curve.createPoint(
                    new BigInteger("233021b483f578dfa5222f8cccba5766ceee0ac65f6d4a3b1673b302a21fb3c", 16),
                    new BigInteger("7d4b6d44d175d4b593f06f5a6dcba2cdbc4eaa2097abaf613123546866cf4ef", 16)),
            curve.createPoint(
                    new BigInteger("42db4e953c2a7a743de9fe20c5798f2247f51db4eabc6f40e86c13909a310ce", 16),
                    new BigInteger("12c1a0764a0b9f3666e431923ce15e7fcd0ded5ab153f0b48d362cca1604e65", 16)),
            curve.createPoint(
                    new BigInteger("30d539e2b545fb957e40e2255f6463b52d227c9808472cee6a3d521aa283a44", 16),
                    new BigInteger("5f9eccf747fe6313570f99e845db32b40070acee9ce9e34da7f3c29ca53a07a", 16)),
            curve.createPoint(
                    new BigInteger("4bd64e5ade3e2733580a6116b4af328751198e7128f9acfe3a3496b545efb5a", 16),
                    new BigInteger("4d584768900dabfc0dbaa086632b8051bb3905ef79b84d96c01514441d0cc93", 16)),
            curve.createPoint(
                    new BigInteger("62d6e771f02e591557197d13c3e77dfa2d1794ac1808407bd8227c4be31b466", 16),
                    new BigInteger("5c6f5607c1808e899ba36a425911fa8566b7ea9cc80de8a80538c0fceb837c0", 16)),
            curve.createPoint(
                    new BigInteger("5ce406218cb2852b1d2fe1836b19462f664631785216e87ffbce26030e2101f", 16),
                    new BigInteger("5225f107743c255ab50e7be4a090fe39478d1ef4ff558468559d8cfa87bb94", 16)),
            curve.createPoint(
                    new BigInteger("670286486e8dda3dc66b0ed3149be7697d3e06c8279844079daa7e42d5af728", 16),
                    new BigInteger("26becabe7430380c56e320f5ae3329569cae7b0af06fd5327ee23979d200eb0", 16)),
            curve.createPoint(
                    new BigInteger("3ef448df33a4394c43e93e5850cd0c5a6dcb18ae1cd865d00fe8ede9336a9f5", 16),
                    new BigInteger("56711f6ab7e0e4f7365ac34e284ac2879f40208c46f6febcc1dcf7146ecf015", 16)),
            curve.createPoint(
                    new BigInteger("4b63fc130288e92f2d6ba238caa7a6364804e29829ac037c57df32fbf762bc3", 16),
                    new BigInteger("1eb8c80af55278b4113286c038fff2bfad2da62763bb03426506b869139da0e", 16)),
            curve.createPoint(
                    new BigInteger("4e7e998557b29a95f805a6e2e26efc1e970108272d4755738c04f28572295c0", 16),
                    new BigInteger("97cfcc2f447bde61bde71049d8200a74a3028b21703bc139143d81a3623f09", 16)),
            curve.createPoint(
                    new BigInteger("574b67898f02964c408f68e9470e7b615be037e40b824e6617f89cb56c21219", 16),
                    new BigInteger("49392d5f8e6740a1b0b7444f56d7a17363f8656c6e4c628678c86223f2e46c8", 16)),
            curve.createPoint(
                    new BigInteger("7e8cb50ea5d5c1b09e219e7305bcb601d99b6d7185b1c388aa8e36fe1e56554", 16),
                    new BigInteger("47fefa308645455c12ccb5817da338f0c4f423b341aff4a9d158891a4fd69ba", 16)),
            curve.createPoint(
                    new BigInteger("67266dea9e71b4ed2bf24a597a823dd048cf31e725db511edceac72998c9ef6", 16),
                    new BigInteger("39babd65850befde1f7c28e41dbdbb4caf82bbcf3bcb5b33161f1c2960b2d8", 16)),
            curve.createPoint(
                    new BigInteger("63e99c2cb9c74eb9227d48065e27abb8f606df8fc83b2c44e4ea38b046bad2b", 16),
                    new BigInteger("60494a53dd13ecf34e08079d343c88fb655d6d810785af81f08d5aa9bcdcf9", 16)),
            curve.createPoint(
                    new BigInteger("3cf0600b0f5a2a4eb78c487cd385350e8c7848e3f6983231881d7f1bbe28543", 16),
                    new BigInteger("56dee4288528de609976ef6b903b652127c37b0590e91a2fdbebc3f11df2628", 16)),
            curve.createPoint(
                    new BigInteger("758f09245fa4b8b23d290ee2b3bfcede199b4fdb11f3cf2502a8ceedd61b129", 16),
                    new BigInteger("622d9baadfde781e985d9722e0a04715666769a4cc7a9bea0b96d6386be1746", 16)),
            curve.createPoint(
                    new BigInteger("38e1a45b81492aa95d7abea2b08b8c14dc0b8a41108b036871fb737910ae18c", 16),
                    new BigInteger("145c611262656385e5ed6243568cd3f9f59dbfed7a01ba11e22bb8bb272e08e", 16)),
            curve.createPoint(
                    new BigInteger("206e54ca53a2f155bd4fc45bf2edb77798ae6623defd4cf22f2dd4a7d119dad", 16),
                    new BigInteger("6c94e7f0825ad81680e4cdbcaaaf4df806d57a0d1fb2331926c3fe2b79d22e8", 16)),
            curve.createPoint(
                    new BigInteger("56e98d2862893caebf66180e84badf19ffc8b53041eaaa313ae7286a8fac3d", 16),
                    new BigInteger("526306f9c01afd6e0c1198ea5de17630f5a39c4ecd02d8e6f0d613c355995c6", 16)),
            curve.createPoint(
                    new BigInteger("4fa56f376c83db33f9dab2656558f3399099ec1de5e3018b7a6932dba8aa378", 16),
                    new BigInteger("3fa0984c931c9e38113e0c0e47e4401562761f92a7a23b45168f4e80ff5b54d", 16)),
            curve.createPoint(
                    new BigInteger("450cfaadfecdb8a2fbd4b95c44cb1db723ee5ac9677c9c188b3d7c8eff4ca58", 16),
                    new BigInteger("1a552bdfc0c81be734f1f6ca9a6dd3ab4daa61c11fb53ebb7046eee25d617c7", 16)),
            curve.createPoint(
                    new BigInteger("6fe20e5c8a8004e33eafc84d16ef770f2f0b7bace19adaaa150f987d295a34d", 16),
                    new BigInteger("28a35040a2ebe9a14a162d3208d5eabc6e2f3a8310f926bd80be65aa71775e2", 16)),
            curve.createPoint(
                    new BigInteger("1bd65f45a35bf62ae8f9ffcbd7de2976b90518b6820c219f039c50043bb1edf", 16),
                    new BigInteger("fb5f0f8659f9b6ed7cb0ddd7999506d0c20b26bbe69d1915a31842cfac41eb", 16)),
            curve.createPoint(
                    new BigInteger("4ba4cc166be8dec764910f75b45f74b40c690c74709e90f3aa372f0bd2d6997", 16),
                    new BigInteger("40301cf5c1751f4b971e46c4ede85fcac5c59a5ce5ae7c48151f27b24b219c", 16)),
            curve.createPoint(
                    new BigInteger("21cfbc678f5a279ebb6ed124273c8df37eaf12a2d04180403ae6b5ec0b1e1ef", 16),
                    new BigInteger("4478ed6a346d899ad7b0b10350270aad39ddd5b68529297e4c91a54357f0a7f", 16)),
            curve.createPoint(
                    new BigInteger("350bfefbe3d864eaadac9cc1195c14159bb736be743aed7380d2384cadd2046", 16),
                    new BigInteger("5e2a4b3ad0e1d7b9b8ef72b10d68a80e5ee691d7db591fcfbaad6240d41da8b", 16)),
            curve.createPoint(
                    new BigInteger("529acd569127f73c8d34345f87e96cebfb48ee12a00a3861cda209337ed94e6", 16),
                    new BigInteger("3120671a89b705e5bfd99b0e7fd2118b4914a3ac309b3d74527cacb5ad7491", 16)),
            curve.createPoint(
                    new BigInteger("55d3d7956a97d10e65a4d8ffeba40deaf0db0b57f8e022cdb3df6df613f5c6d", 16),
                    new BigInteger("159e59a6f92f48fcf85aa96c1a03749a4c4e2cf9e2bc94dd36796daebd9b8b9", 16)),
            curve.createPoint(
                    new BigInteger("405f019ee8f2e972a005c549b0884b5051f63d1e78480b73208dc07d8c65a1f", 16),
                    new BigInteger("4301a3d0c285ad309ff24a12c100ead7f48ba1368143712f32ac141ab4d9e8d", 16)),
            curve.createPoint(
                    new BigInteger("376d59b298d982f02dccad0edd5bbd4e5e8fad7898750675ed0856850a7babe", 16),
                    new BigInteger("5233b12bbc50564eb61cc098a17d3d97f06ec7a230380e4c5d3b725cc318eba", 16)),
            curve.createPoint(
                    new BigInteger("2f55624af6109ef04b2ed035a44a904ace8627f55889f011f768aabf4de9a38", 16),
                    new BigInteger("7f64209ce7dfb63337ccf3d8c14f4093295f86996cabfee23b1655549aca089", 16)),
            curve.createPoint(
                    new BigInteger("3b8965e942bed2714bc2e685fb103496e1e3595ac6a343d6df45fb5ef6979ed", 16),
                    new BigInteger("5b7cac7a165cb69ae103dd9052fb39c00ed0aad47989005aee53972d82d45b5", 16)),
            curve.createPoint(
                    new BigInteger("7abfe3accdec1eae1a50049efdd9a8eb7c2921a08e8bf1fe606e9d5a4039ec4", 16),
                    new BigInteger("3af178e7e831f8148244d2d2b284a32991852db6212ad0a9d77540ef648a5fe", 16)),
            curve.createPoint(
                    new BigInteger("4983196df6ad7d6f0a8d76f86af3863ad8611374a03fc0fd00793181dbde9d", 16),
                    new BigInteger("204c1f91b70f975a21d24a8face664e496f00f602daaafa69a3b56098a4cf89", 16)),
            curve.createPoint(
                    new BigInteger("79e2b91c1531a3b16dbd53e72d94e16bf265cbec261658151acfaea3718ea72", 16),
                    new BigInteger("3d9bdb47e8b148c1c5e9e694ffbc2cf71aac74ae1a85e8d8c3f77e580f962eb", 16)),
            curve.createPoint(
                    new BigInteger("297efceec61b3be17565843cae465c52524b4ecd9331a4170f54f7de8c4556c", 16),
                    new BigInteger("6ccef1733624cc8b973ac63dd54e7a53604929affe81c3439525ae5ed6af993", 16)),
            curve.createPoint(
                    new BigInteger("44f04b1966264a23ccdc870c8563ad2efcd4c8087b5469b90e792287a5581c7", 16),
                    new BigInteger("1c417f0e9829fa3d3cbb7c3cf4dc7aac04c5bf66ff3f86b833a42c533aed1fc", 16)),
            curve.createPoint(
                    new BigInteger("6ff83f5d8b51db3be0bda80eed2e2adb7037f2f58f705e88f0f98197431ac26", 16),
                    new BigInteger("64f59b8428894c2b7afd740866065ded42e716c7d48accd3f117f22768ed9fd", 16)),
            curve.createPoint(
                    new BigInteger("14aa8187c9559f77cd1cf96b2dfc949182529936f2b0b4050ea56e134073b24", 16),
                    new BigInteger("5f36508c68b1dc586f3fd3f4e2bd29c6d8258491b8a6aa19ede811ce0d3d0a1", 16)),
            curve.createPoint(
                    new BigInteger("95e8882a68c5000d1c2be7c0b43e7f2a6f8de906485241f0285a5c73a27a83", 16),
                    new BigInteger("1e4cb67207ab73bc1e5d19fa2146fde6d03021393b77a55df4ddda1fd28f5b1", 16)),
            curve.createPoint(
                    new BigInteger("2ae0704dacb3da47d564514b4c3543505b403ba09a248c6e74593cba1867ff5", 16),
                    new BigInteger("5a4b5818088dc9ef4066b90a8893ae80fc89584f987ec1928ef9d72cea2bd67", 16)),
            curve.createPoint(
                    new BigInteger("61a10898a76fb99989e51c0e823cb60b95ec7ccccb917c42b2b28014f5fd94d", 16),
                    new BigInteger("23d8ec1de45366d3b86c64c2da05a2ce3d171adf52ca5522e652ffd0eeee795", 16)),
            curve.createPoint(
                    new BigInteger("79884133c879cf07734976fd64de220c5a972e04c2a3afb74c362d6c3beecbf", 16),
                    new BigInteger("2aaa0e6d4891b792b5643fdf09873343cd0e3fbba3cbd0601b481a4083f32b6", 16)),
            curve.createPoint(
                    new BigInteger("45f73d2fa82be6c5ccd0f62d2237efe8727c479967d27cce28e42b9a44bad5b", 16),
                    new BigInteger("2fa4932215f72d56d8be5205c5851c9b3e5f2a14468e4a7acace5437c6b27dd", 16)),
            curve.createPoint(
                    new BigInteger("37f53f771850f52f9c8f87b53c6bf0c93c2bed76f5fd1d5697356d0b2325007", 16),
                    new BigInteger("50f1a052b79b446fbc7b93ffa1a4515f6c3be3a76a2b0bc5eb8ff327549960c", 16)),
            curve.createPoint(
                    new BigInteger("71bd6d23e0d2f312d47582efa609101f15b9ccc571fca8ac4fe3457c67fbc9b", 16),
                    new BigInteger("3b3fdf86bd4c7fc26d60540a6439b4d179dcbf7b91efb0ddc60dfbff9a148c6", 16)),
            curve.createPoint(
                    new BigInteger("78219ba049438385b829c13a4993874a4a326c4143de0dd581c7b9956f99b06", 16),
                    new BigInteger("5505f1268dcdd4ee01b77abac3bfdcbf3f0513ab097c69ff777b4a631aaf256", 16)),
            curve.createPoint(
                    new BigInteger("b81e924a86536dcf68bc5a2ca2065a61103ba6c9eb0ae4cf8cce9dbe286f15", 16),
                    new BigInteger("653a6dfb51acfe8a844fb8362795e5549d424aed88d3a090366a44f840b5b83", 16)),
            curve.createPoint(
                    new BigInteger("441c0d7b7aa705046dc0e07ba5f33a7d9df23f694a05192ff8c2d7be2aa3fdc", 16),
                    new BigInteger("4c06568c0902bb99d428bfa0a946ed0f0ca0a51fbf07cad88e06e9c78e38a59", 16)),
            curve.createPoint(
                    new BigInteger("2569c8c78b6d6b92533f29f767c95720d377fa63ad5a3b9827ee0a74b0488aa", 16),
                    new BigInteger("4b59c81d3cfe08834f946d9d57614f5366e0bcd9349475aaaebe01341196fe0", 16)),
            curve.createPoint(
                    new BigInteger("3f2fa285a0471647b214eac652bbad9d58a9f2dd2e812aff0210d0d8a6eb32f", 16),
                    new BigInteger("4cdb18e1c2848c2b52c1a6557165bd1a8f55c2f7562f5cc0b326f73c25b696c", 16)),
            curve.createPoint(
                    new BigInteger("5bb5141ab4fcc5290ae9151b8045a2cd8391547ce7b3b33cbbb10f8fb538092", 16),
                    new BigInteger("5a36bfd52acc6a83a9913b937ec086cc27fed030b5fa70dbc5d3c12c9515f56", 16)),
            curve.createPoint(
                    new BigInteger("3f3fed272edf91aa7f8ca5d70005d390fbc67830ffc69c5fa3ae17582d2771", 16),
                    new BigInteger("459057e0883c44d8776fa217405f443e5954f08c4a5db68e437becaa664a999", 16)),
            curve.createPoint(
                    new BigInteger("5237ca6656237a717a739a4509f70db1b9dedbb6cd232f60c9bd8c4563a6b1f", 16),
                    new BigInteger("56c7799dd02896dbe7d69dd8bb9718270549592099569d107b7b49c34bf5a49", 16)),
            curve.createPoint(
                    new BigInteger("1cf6b8499ac881e0b2fc7def9bc1a28937033b2fc52de99e75909a620c7a281", 16),
                    new BigInteger("5769cf4f735366fa386b6858043dc99a100f86fbc77b16d57d77766197ba27a", 16)),
            curve.createPoint(
                    new BigInteger("1b74b8a6b86dbf9638cdb0601e1a332b8d880753423d38c3394902c57f15e40", 16),
                    new BigInteger("6bb2dc10d2ecbb913219d0ebdc8d3337d644ed8b6c4e70637ef4c7e50887488", 16)),
            curve.createPoint(
                    new BigInteger("61e4da415661bba52a4737e2bcde1a837787c4796b2e1854778534f1582c29b", 16),
                    new BigInteger("27c43e632cb7652e8508c9c38e3b4ad0d3dd6ba748d42dc84ec2685e64b9aad", 16)),
            curve.createPoint(
                    new BigInteger("7c460a204d23f20ce86596dae6ac9b36734e4a9f7c5b43262c97a36c6a41c6e", 16),
                    new BigInteger("481a11f9300ab4c4bf6924c5ca884728cc361247377065920966785d043fbbf", 16)),
            curve.createPoint(
                    new BigInteger("124ff5e55e4effa40daa5b9618d75c49c8b6fad95cbe8c0bfdd83cb9bed8316", 16),
                    new BigInteger("33a2ea15d0f71f58a00de71acd7f22ccf9002115e49dd1f7631faa0d32f9987", 16)),
            curve.createPoint(
                    new BigInteger("61c9f8fc86715e95ff43583a865c5a6515f93381839d557ef884a68637eaf4c", 16),
                    new BigInteger("5877daaa42bbab9083b571e12648a9d62ced4470d71653092b6546f4a5acceb", 16)),
            curve.createPoint(
                    new BigInteger("70a6b9a9e5d1fcc07dd9ebef6d8f5fcf04c6cb34932d0fe2335330ac6dc8d3d", 16),
                    new BigInteger("3f0cbd332ac56922e886656bee74f6e9bb4bb88f7af7bba9098678af1f38fc", 16)),
            curve.createPoint(
                    new BigInteger("41db8a0f1ea78443a39e08a54323743c8897eed1ddc28f41aec6f2655040d9f", 16),
                    new BigInteger("7d4bf32f8f4719c2e4af8b7889f3b65cfdd033dc2f971798a12170f2b26efce", 16)),
            curve.createPoint(
                    new BigInteger("62f035e01acdfe841104942d6c8c07f0fbd618cb85998ea24bcc24cfac1f8", 16),
                    new BigInteger("1caa886104b7d753fda93645a746989794cd825c62473b526ea34b3d51b5771", 16)),
            curve.createPoint(
                    new BigInteger("441c6f016d270e86c19843727b83b864cec060cafc813b23d7e41e5abb1a60a", 16),
                    new BigInteger("29fece4e40400f3acae0586f4fc8ed535e805e472123ec38d662d8a0b01c086", 16)),
            curve.createPoint(
                    new BigInteger("2c791ba0fb0b66177815c98191fa6188dba9c795e34a7c3c8a19086215e3cee", 16),
                    new BigInteger("11123151389d4b330db6a665a560407e7cd8c3807c749e2b0cffd9c3074ba77", 16)),
            curve.createPoint(
                    new BigInteger("5292da4ca71ae75ed0554c267747e39c7a129b3b863e1af3ebb3e368439c4ea", 16),
                    new BigInteger("63af6a5016deea8cc674c44f16c63c1db31f09af4fb4d2ea7917c28116661fc", 16)),
            curve.createPoint(
                    new BigInteger("3367388d5d1b7758dc3d92e244f227bb8a54e3d9909e7b7dd62ab5965e3efc7", 16),
                    new BigInteger("7ffb4833071e4b03ea755ccb9938487a478248fe9b1158a08f1ac298801c092", 16)),
            curve.createPoint(
                    new BigInteger("95c863314b7f18090f8eee602403be823a367a1b416d54c32e5f914e67d922", 16),
                    new BigInteger("159c2824f899171deee23e0ed520d4825bd667983df0a8d45d3a1f7156d91f9", 16)),
            curve.createPoint(
                    new BigInteger("621c6e08b3c57404644ad49ac7629832c141273fa1f323781b3395393fe985c", 16),
                    new BigInteger("65d1eb0140652958c4371ebec791e03317d6b2e689d90e304666f1b610783dd", 16)),
            curve.createPoint(
                    new BigInteger("54313129bf13993952cd2b31ed06013aba85e74c1b8a00e062031f32188a84e", 16),
                    new BigInteger("680129efc9eb8ec07fc180e8f6877e5f0f9f44e3000a2c586ed4ce49d12a313", 16)),
            curve.createPoint(
                    new BigInteger("21ea57a1c8286bb45872e78617853c47b89091670ba51c124afa3362e7260d", 16),
                    new BigInteger("7087e5c1536df233ec9bfe2f983e8d7622892b9bf64c450c9823898e2cc2fc8", 16)),
            curve.createPoint(
                    new BigInteger("3793b05b99e7a57d88db4ed0dbc3b771285abcd9052da50f88595354409f3f3", 16),
                    new BigInteger("12164105041c056f127e737c7cd63981e05f246bd2b6b65d1f427019c7c3801", 16)),
            curve.createPoint(
                    new BigInteger("befd345cef5fcae22ac37dacd6b9128cc58cbba3e3fd774e11b421c2ba392", 16),
                    new BigInteger("6209d25f24f88f7876ca604db23d05f78e6b3b67fb033f2f1bee221f352b8c8", 16)),
            curve.createPoint(
                    new BigInteger("15fa536045fda4c65ff74f10b4e669ce88b9996c6772288289d3ad725987fa6", 16),
                    new BigInteger("30e0c2124a35e265e931ccc66ce5ac3697d982814beb407144ff6762cb691df", 16)),
            curve.createPoint(
                    new BigInteger("38b795bd77ac573576dc204857a488cac2cce19809882631ca2069598c577c8", 16),
                    new BigInteger("786ba555d55ebef688b068bb9186a34a08cb00bdfef51619bbf911890ae9a13", 16)),
            curve.createPoint(
                    new BigInteger("6c66853592196c3eb8d9526dc155205e2c64097adf8684bb0e15eb460ce1c72", 16),
                    new BigInteger("1bb4ebf654f4250c8dd1061a4e1b464b31a8a9999ac9960446ef8108a66871a", 16)),
            curve.createPoint(
                    new BigInteger("5b08dfbc87ad9c00b88e78816973ad2f9c10c70f2156908892cc7b7a2a1fd30", 16),
                    new BigInteger("1151f407a77e2556073173d8f5c9ff561d8a23742121ca15f7d0ac391af50ea", 16)),
            curve.createPoint(
                    new BigInteger("309190eba106aa6ead54b5ca5817969aa68b4b4c627700799a49fc6bdd32ba1", 16),
                    new BigInteger("505b6a2bc7b0d78ca6ce2abe7dfb7312369918a4599cccf8a615f6701cfd851", 16)),
            curve.createPoint(
                    new BigInteger("89cc205966af08acc8910d563af7443d5dfbb5d88dae79c013c678c65dcecc", 16),
                    new BigInteger("1f8cf955694b246a423ac725791231257b88936e00347ecaa1e17045c0ab540", 16)),
            curve.createPoint(
                    new BigInteger("480086b61a80c36cf1e1a350baf554e58ee8d9333186b70c9c512fb9e9d5a84", 16),
                    new BigInteger("511edfe58f8d36a6170df743731da1ff525cfd5108be20e30ac4183d1281570", 16)),
            curve.createPoint(
                    new BigInteger("3caf14fb1d2e90a13ad4eb091250fe37133aabf6029633e905e5a93ead41dbb", 16),
                    new BigInteger("49122aff6059dfda19e4b973aba5ebe3804c91728936c6381c1ed1ea9380920", 16)),
            curve.createPoint(
                    new BigInteger("66d1b8fb2cabc46cd79741ce1cb7326077ad8ea3227a6427244bdd3806bdadd", 16),
                    new BigInteger("4a52eb74f4d5371ba3265dffd61c844f9e68d4ff0b44dc4936182f9280bb66b", 16)),
            curve.createPoint(
                    new BigInteger("373330c5afd53c31257fcc9050fef873e15ea9f81d9810f30744309b04e02b3", 16),
                    new BigInteger("5889806607b3dc97a9c5b0c8a2f16d1792099a22866b879ca480cb89a11ef5c", 16)),
            curve.createPoint(
                    new BigInteger("26840d0ec69a22c6818ff64b8b14633b531508c866e21d1dc9239778ae9e8c7", 16),
                    new BigInteger("157971f9a6e3a24d3b307be0e7c8cd352e2eb5cad33cf276270c0f309ee63fc", 16)),
            curve.createPoint(
                    new BigInteger("ebb84848f1c38c19a754d1b5d9460e39624dadbb30800987c9419c0f933b9f", 16),
                    new BigInteger("517b297cf32f4064e6d6c8e761ba8db89809604a701c7b3aa1a9c6beb370ea7", 16)),
            curve.createPoint(
                    new BigInteger("25780380bc0795ed0dca727c55240f1d63593e552d224adb40df2d3721c0f66", 16),
                    new BigInteger("10215fb5a893e0275e9f1f66b217dde35addee91ed0e8f7d79531a2ff57b8c8", 16)),
            curve.createPoint(
                    new BigInteger("243e1581cd1abfbf18c31c19a4c3d1cedfe69a40bb57b607c9af2717eefc742", 16),
                    new BigInteger("1296c27929f14535718c3a4ebe045f00afdc60afc74c7d398d8ce1b6609dc0f", 16)),
            curve.createPoint(
                    new BigInteger("48babb8649e054bc8e0b902c89e6940c265f48464520649502ef1064eb94562", 16),
                    new BigInteger("3235be7852b0526d1a16f6969ec0e5b0e09cedaadc65863dea4e47f4f398264", 16)),
            curve.createPoint(
                    new BigInteger("592db7c27e63489ef4bcef2eafce89f40067cd9a1ba48bc3dc76b5fc62ad9ca", 16),
                    new BigInteger("48b7711b570cd9ac65910e75e752f4b751fdbfb4091a28f59b8c046d3d9f8bc", 16)),
            curve.createPoint(
                    new BigInteger("31d133456222586ae42a9ec7ce8539ee04afbe0b2ed00a2564dab0798d9b55d", 16),
                    new BigInteger("a77c52fa1fd718db5c83e7fda6d7d4d9aafef9ad95cad621470f2b753729e5", 16)),
            curve.createPoint(
                    new BigInteger("4651668379883521e7983aafcb93811b4a72ef2975b3277773746708ef3e3fc", 16),
                    new BigInteger("512507f3f544d80ba5d47f73b571881e8d70d7b1d305b9704bdad036b7abc47", 16)),
            curve.createPoint(
                    new BigInteger("26069e359b2e847affaef604f772f36224608b7642245d0e643889ed231bddc", 16),
                    new BigInteger("75ae1ec379f074ebc91270077c74b4d34347ce183b676b4dbe100bfff143b9e", 16)),
            curve.createPoint(
                    new BigInteger("3196d01d1fa11dc3803b4813c4bbc6326869f61410f2bd14bc0f570d875aebe", 16),
                    new BigInteger("20313217cac79875bd2a503db1e86d1e5559911667a02524759344468d9561d", 16)),
            curve.createPoint(
                    new BigInteger("483256607f75f06fb126addc60cadddd602154cc4782bcc08351a48745d0b97", 16),
                    new BigInteger("2950a7e500ebbe9775f08be37cc2e62ccf9030de18948d1bab07a4a9173f75d", 16)),
            curve.createPoint(
                    new BigInteger("65f07b6050a2fc6eebe2c29ffa62f764060f7f9d3c82d2cb5e4e368aaa442c9", 16),
                    new BigInteger("562c9654b646cb84a213b41de203c871b3eae0a05c9c105a66a53c319c06373", 16)),
            curve.createPoint(
                    new BigInteger("284870f6181c43f3b01d94baa9c5b6ada0deb861145523ad9169580eb7bed35", 16),
                    new BigInteger("5e03e6c40c1cfa3cafb01fd0622349871832a9d35499d06408a83edc1b76d02", 16)),
            curve.createPoint(
                    new BigInteger("32229810a52137f0e6c3d37595c46f6132822d4b05f42674b48d7a7ac3ad85", 16),
                    new BigInteger("7babde959a0cf2c53ee59fc52c77c3adf899453f077f441965629f9aead30cd", 16)),
            curve.createPoint(
                    new BigInteger("1ea8b98a6b85e74e0a2fbc18b206e290f3ed94ce99ca665e8e2351dfade990a", 16),
                    new BigInteger("478e93c4724115fb1648c8d5347422adbc1a0bbf962b2312e14aec80e1be742", 16)),
            curve.createPoint(
                    new BigInteger("270cbaa08c79140c85b864475a0bf569cc03ac785e57f543dc444f37ce746cf", 16),
                    new BigInteger("3a9b8d894016680ae9d1bf3deb931d8987d4d8d8bfed45b81ccc595ec79046b", 16)),
            curve.createPoint(
                    new BigInteger("6943922708b8ae5b40dd7031ef2e487abc4ac39a3591368285e83d6c9c51f4d", 16),
                    new BigInteger("5f157c37d09634e8cbfbef90ea50af59815d011e419a691c67ca3402b5efc33", 16)),
            curve.createPoint(
                    new BigInteger("48ac6a80979fab4912cf0cb557d917a0bd68825d8658ec100496eaae6ff62e1", 16),
                    new BigInteger("2b6931350ab183402e39476340eb1177b7006f7a552915581e29a79bd7203a0", 16)),
            curve.createPoint(
                    new BigInteger("e3adf9517d92ef22d1e2a787740a292ba32d5ca69faa9e8675f63ed816dce5", 16),
                    new BigInteger("36bccf69bb12dadd610145a3399213248d193660d8dc90a2e206f23bf2c7997", 16)),
            curve.createPoint(
                    new BigInteger("5e6c8ae5afb2fa470f767581f3d578cf6a49547e4b78665edfd45776948bef8", 16),
                    new BigInteger("6cbfc11953dd7e195d2ce74e52a60df524767b44c4608bdd755be4bc85eb74c", 16)),
            curve.createPoint(
                    new BigInteger("15a576a1242d39300f0db3ad770983825988da0457718ecd596c63a0a0eb4a6", 16),
                    new BigInteger("69a42e5f6f5a63349b57683a4609bba90f556a1680fa1ec3b02ee7d3211f903", 16)),
            curve.createPoint(
                    new BigInteger("274cd14e4fbf2ed07402e8ad8075b320c5f76b7ea45ea36af523e95ed63ab50", 16),
                    new BigInteger("6ca640f9557c5f2d8b27f6ce95b108880ff4e4816b26b70b6506114389ce656", 16)),
            curve.createPoint(
                    new BigInteger("4d8284e132e2fe81c5f71be1e3c79ab51b229e2c56c323e207cda179999d123", 16),
                    new BigInteger("116cfc00e9fbee1cf16af6282123cdf20eed13021c2037ef4c86f94eb6e6cba", 16)),
            curve.createPoint(
                    new BigInteger("4056194fb5643e97991942ef5b63cadd89080bf57a01489c4398aca03f0980a", 16),
                    new BigInteger("2e2cddb434fa6f6da7859c3d518f0ced8795eea043a6c9613fb3e020103339f", 16)),
            curve.createPoint(
                    new BigInteger("5d119d5c5ce532afc0875e0ee9b026d878c8773d34237f90a0d0670da6f01b3", 16),
                    new BigInteger("4a79fc025ce076b6a4742fbcc8cad313d0a8220c58024a41a5a674c0947e64b", 16)),
            curve.createPoint(
                    new BigInteger("11800ce4061d99b9d53fd4138802335258f7798c5a935c9979f5a949ce1d483", 16),
                    new BigInteger("36745a4741a5c7290eaa8f2a3f9ec955ccb7ca323272e5d35d35c2a724ffac8", 16)),
            curve.createPoint(
                    new BigInteger("4302525bceb97fa642fd5560a4a39fba3d2c06f68e6aff3332ff1854439ebb3", 16),
                    new BigInteger("e31edfd081ce82f8177b2d7d96e69851d09e908c2517114ffb37ee12c0ac64", 16)),
            curve.createPoint(
                    new BigInteger("2f5fcbb96f0a66fd3bdfbcc78bda361cb812570f50e7c476533d56eee01c0e3", 16),
                    new BigInteger("527428a34855b5695c479d8fb7e831a299f7897f36682a74169cc60d160df2d", 16)),
            curve.createPoint(
                    new BigInteger("52167df045ad0dc999b98de3d035aced9da4434211149b8cf4bf20e774580cf", 16),
                    new BigInteger("19051d2a1ad3fab190c5dfaf45188b49b4e90cca22aae54f0a785562d3d3f41", 16)),
            curve.createPoint(
                    new BigInteger("541b5332491dbdb2b6f6bccceb7634970c046963891fae936dd950f4432b961", 16),
                    new BigInteger("78fa54da996a51e3a9c06091d58c2405a806649da2bb1f323807c4eec50eda2", 16)),
            curve.createPoint(
                    new BigInteger("5f11e973da659b7738f87ca5bd4f3bd02207dd3c8d978f0d3e83fe81030febd", 16),
                    new BigInteger("137aba7027069f62d25caed416e13537687bb1428e71e5f0a0c52d52f2e65bc", 16)),
            curve.createPoint(
                    new BigInteger("15ec941ee6c2110b819b5541be52981c09d83484c9dc735c43f39f5778718b4", 16),
                    new BigInteger("4561826142dc5b56acfcf605a78a4090472bb61235bcd605a765e05d0a7e549", 16)),
            curve.createPoint(
                    new BigInteger("68ba398736d659522f484406110b43c68158bf4992094acf797a38979c587a4", 16),
                    new BigInteger("7c1d9e1702e28afddf22fed7a7a79df4315c174d0c6c4f4c75bc77d9b56777f", 16)),
            curve.createPoint(
                    new BigInteger("67889cea31c81a429fbae643a4fce0ecd690a5c32b99397e39ed6d7a08702df", 16),
                    new BigInteger("7ea277c80b671146c9e455b98f42f45b941ac95ca2d15c8fa9ea82ee9b45e01", 16)),
            curve.createPoint(
                    new BigInteger("596f2c68390ac26505d3c2eca5c77d46f8f3acbed192a2649d8c525a58d2334", 16),
                    new BigInteger("49f3bd8c62c610d5c19c52d970bde24b270c4ff7ae900453b909e72483974a0", 16)),
            curve.createPoint(
                    new BigInteger("567779fb8b0afe592cea284629e3621ccfae3c4d7d3dc559c9fed750591a395", 16),
                    new BigInteger("6010bdc33f1cdb374facefff537e7910b72a1120502f312a7ce41df0d552ddd", 16)),
            curve.createPoint(
                    new BigInteger("cebed0233e810aa6a29a8b0829d28f1c92f303d14dd73d6b12da98117dfc7", 16),
                    new BigInteger("4bdd51e1192a00df23aa8d0673e4915877ca41ddb8c9eaf21d39dd167fde7b7", 16)),
            curve.createPoint(
                    new BigInteger("4c7085f066adeb6781596771972b188177e63f2e2b3788d03e033cdd5af1f06", 16),
                    new BigInteger("2929ee89f525862b0cedb3ab9b5166e1680cb77fb4668f10a6a3d76b5434566", 16)),
            curve.createPoint(
                    new BigInteger("760e341bd836899c226176f47685f69438270c150c6fe7744cd723cd1e72359", 16),
                    new BigInteger("1bf09f2f1aac1a10ce8bdf20d5d178db747f01a4aa0aa8a5e4bfeef562cd94e", 16)),
            curve.createPoint(
                    new BigInteger("6016b94c00b54920027ef64902c61478244b1936337d2ad41d9a8d43dd6a4b2", 16),
                    new BigInteger("3bf3dd9bce7f6d6f120de87fcbce6219340b59c2c1d75ee0d45105d33aab1cd", 16)),
            curve.createPoint(
                    new BigInteger("4929e44ff692eb944d1045bee96e750219cda3bda0500029f0df49a1db30b5b", 16),
                    new BigInteger("2e138dcbd092242699004b4ce98764ffe4e892841f56830af298581cd1e523f", 16)),
            curve.createPoint(
                    new BigInteger("5972d0e526311bacb70a04e88969b6c63c7399b578f0dc28bbd00d65ef01da7", 16),
                    new BigInteger("76b22bca9ac12d26530e7b0757e646beb3bbc5680d0f3f82fb8ee57ed4b5e39", 16)),
            curve.createPoint(
                    new BigInteger("2ca0a42a26e26934ca2d48db960b4719113d87c5e57fb437d557c5eb4e03ac7", 16),
                    new BigInteger("62778c02561d4ec5d83a132afd7763a8349207c6b5d01fba70b56ba660cba2e", 16)),
            curve.createPoint(
                    new BigInteger("5137ee53f076e21a2c23da09f63c0d275408c31e4634a6b6373be5cf13e6c00", 16),
                    new BigInteger("14fb446c077beb78e04de3282a63bfde12f9af85caaca4ddfab506cee31c0c1", 16)),
            curve.createPoint(
                    new BigInteger("7d944853d1627b63f560aeda33acf640d35a4ee4d23a744957a2dae9d5b7c6c", 16),
                    new BigInteger("bcb411a210710acbcb9ea12680d89e3e4e652228b6786d3886e95f4d9e6970", 16)),
            curve.createPoint(
                    new BigInteger("37d412c2ffb173a728477446b60b2b702d07a5243cb5fc8963e623a5ee75843", 16),
                    new BigInteger("672c79968908f92cd0cb0b4c65ba86e8f359b015623a89441e1bf859bba84cb", 16)),
            curve.createPoint(
                    new BigInteger("5b37f472aa80398bff12cc74c8ee784c4fc89757292580d3a498bff17e9f114", 16),
                    new BigInteger("7d79da1aab9cfef58a5f3d1c9ec466956a45f8d2af0c1da6dd4c93f720fae6e", 16)),
            curve.createPoint(
                    new BigInteger("25c09b3f1188c562571536202eb0f5fc4b9a7590417b8ea58b4343685d88a63", 16),
                    new BigInteger("3d5b817c73b37e9a1d24ca923351359b42ced2f3cafbcac8c2d6322dc767bb", 16)),
            curve.createPoint(
                    new BigInteger("32e60904e73f9756f71e0a918d302aeca17cad4acacc81bab15702ab5ff78f0", 16),
                    new BigInteger("bcf4c0204f8275072f98a65b09ac58b87cdc9c70c4edfe99fe18870a3a5459", 16)),
            curve.createPoint(
                    new BigInteger("49c35575996c1517d2daed90d2fe4a58e674d6b4aaa7288d0642c8bf59e562f", 16),
                    new BigInteger("57eeee00adea4ca80eeabab57852cbf03f1a57e21872cd44221e0550b9193b8", 16)),
            curve.createPoint(
                    new BigInteger("10e1776b4c2a867bf1b028c6edec224cc6616c747e272f49e69b67b02a893dd", 16),
                    new BigInteger("8d45d62ec8e627b56950f2f7622a0438647f9e9f28e723e4a37cebc039a1b0", 16)),
            curve.createPoint(
                    new BigInteger("79a93a75ecbe943acc964fd39ecfc971dc6555b2bc335e7b53f52f4eb16cd36", 16),
                    new BigInteger("146132a68ce2ca8b48363612226771ac547eb3cf52b6eb7981718faac08aa3c", 16)),
            curve.createPoint(
                    new BigInteger("6b22d32e0590e169504e7f19864fd646d0994e7ed3e578a5b88f6e095913439", 16),
                    new BigInteger("68c3b22d859fb85e5c8fa0a8aea932285945b230957e603394333e9ad5acd82", 16)),
            curve.createPoint(
                    new BigInteger("71ce5ec8286eb8c93b8481c6d19cf0a288ef4da4397e9c80f65023e516bc097", 16),
                    new BigInteger("54470babc742780cd8a05499026e738ccbf81d4170d1731734de68a8e5b402c", 16)),
            curve.createPoint(
                    new BigInteger("27beb13a43bc6a1f6ce046da438b0beac5899ff4d57962dcfb6476b563f74b", 16),
                    new BigInteger("14074e9e93ee45394dfbe833998b9d1691961f8ba3166224b36404448c61bb3", 16)),
            curve.createPoint(
                    new BigInteger("6b1de6c8f161aa6509a1dcacf2c0aa1bcf6ee9d9b40e032a9d72f77a6fa298c", 16),
                    new BigInteger("5e9312eb5b59d6cbadd7d3dcbc39f1b5bd9a8346fdcfdf1107bada6f9cc048", 16)),
            curve.createPoint(
                    new BigInteger("32670fc3fa43bf39974ba72ea51f0d045d92d084a81fe5282dfc8309aa900b9", 16),
                    new BigInteger("518fee521bf1af62356aac3b7e53fdbf57121e030c6e9572b3de69912ca4eb4", 16)),
            curve.createPoint(
                    new BigInteger("4b9ca363eabed9c66091a347375f7065cd28f49f914447de7cc1461f1375f1e", 16),
                    new BigInteger("3a1a3a2e5e7e72476befe2571ece708052d740d02cbe6fed58740968ae609c4", 16)),
            curve.createPoint(
                    new BigInteger("4cc6da42863a3deca62fa218b7a3b50e034eb4bafd393eccba3f4cbe192ef10", 16),
                    new BigInteger("20bfa683c884f203713953b26d2821287ecd305fa2cb70570474533fc07f918", 16)),
            curve.createPoint(
                    new BigInteger("87705353c44a5ccec8de65cf5433be6b3d9bd21eea49b60e6c907cf1a67a6a", 16),
                    new BigInteger("112804b13eee56e3b01aff75fa08fa8374c44fc461aed8a30ad54acd09c24eb", 16)),
            curve.createPoint(
                    new BigInteger("6cf6eeeb9d339c0a05f72fd5af73fc7588e6d957100ee8999109437bc126cae", 16),
                    new BigInteger("54fa257cea22032eac272fcd034dadf2e00d602ef9e519cf7072023c130aad1", 16)),
            curve.createPoint(
                    new BigInteger("19b32925048c5519d929650c833661b452ef7be7963fab0b6b328ab7dd7a28a", 16),
                    new BigInteger("1bd0c14a10bf9b88ea61011c0b2e64d07da151c6203800d5a5d12063838a510", 16)),
            curve.createPoint(
                    new BigInteger("12a5fc5559428bc3b4eff97b21b63668b866e0722807f1db1f19696bacd9b0d", 16),
                    new BigInteger("4c2eb07f0c24047a3d73b560144f3fd32c99d6dbd9fc7cd2fd2a72a6e4b24c7", 16)),
            curve.createPoint(
                    new BigInteger("13662b7a7d390aa76eb86a7c3bff6d9913eb28db6bd1a7c42de5cdad2e35ce2", 16),
                    new BigInteger("40626aded7f56f82cc431ae30527b096f57fbfbc04d3e12a5abae3edf301cf1", 16)),
            curve.createPoint(
                    new BigInteger("255825bd49b8a2cce114360bd9c8fe8c641af64c8e7710107213cfcb006f43d", 16),
                    new BigInteger("3619cce4482335232f9e76a1460be9d296f2d468d26e4f95a78c71524fe59cc", 16)),
            curve.createPoint(
                    new BigInteger("7f83009eeed4f12f54d341bbf06066480cfcdf51dda103ac54d4bcecf6b3b31", 16),
                    new BigInteger("4269519d28faafd7fd68bebfd8404d71ba05d62c4bb6d65d24aa6802fb84ab6", 16)),
            curve.createPoint(
                    new BigInteger("2f325650eb316646b4eec903fe44828fcb11054f1bd42ca3a77f7e734110b35", 16),
                    new BigInteger("44f976082271016f9048e22c507d97d628722bb431f8d5cc1890524e6c386bf", 16)),
            curve.createPoint(
                    new BigInteger("750b166bb6edc0ee80fae39c7c106879036738df2d79fb2294e1c21e9a24d6b", 16),
                    new BigInteger("54f8aa297a1afafe2a17a3254f45861167414327e918d17003c6aad01d0b24c", 16)),
            curve.createPoint(
                    new BigInteger("3aedb10db9cf3285cdeee375879396fac1fb50dd259e1716f8c01e66f67ca72", 16),
                    new BigInteger("7feb9400f621f58c21601f23b7ec7c94a9b6b193c1cd74a8a60846aedadd359", 16)),
            curve.createPoint(
                    new BigInteger("4ab7151702de76faa493e7a0b1ac20ee4d10c33b83fec9477547cb1236973eb", 16),
                    new BigInteger("63f1f122e3ef3acc46b0915ac69c3f5772879799cad889a817f55f5853d1235", 16)),
            curve.createPoint(
                    new BigInteger("1675ead0d20e5bc3a7a7331999a87ac4c916ae29669e54197bb02aa6364520f", 16),
                    new BigInteger("4d1122da90d49e491922d9b533a6a668e2f65a2737ebb391ebb29fb7c1f8a9d", 16)),
            curve.createPoint(
                    new BigInteger("2f7148111ef53c613157aeec12e16a20f13481da4390b6ce18a85d1d8547087", 16),
                    new BigInteger("2eeda779ab395597651d2a0b833ccf53b10280750139916ae2baf4ec57c633d", 16)),
            curve.createPoint(
                    new BigInteger("4439c7810e7b2ba772b701ec3acdca0b80c9df23047710b87f7dc3f13b337d3", 16),
                    new BigInteger("5029cfe704c602a8a4662af0a5860ec03fb88f046d0e3400f2ce7638014c621", 16)),
            curve.createPoint(
                    new BigInteger("2248eec40b5732a6a488b681f093643af7937071bc73118acae295a32b51b05", 16),
                    new BigInteger("1577e4aec30a97b648de4d0b19cf8891151b4eb11f8de9c6d7312f091552e19", 16)),
            curve.createPoint(
                    new BigInteger("4738424e558d4e0d87a3124ca02ea24f0adc6b7a9768b0d3945ed2a6104857c", 16),
                    new BigInteger("33576f92aca3f0c8ae689c3c274c2de6b918940d86a6852e02fc99e35d1614", 16)),
            curve.createPoint(
                    new BigInteger("7829edd8b866ebf7baaf604ed13d19a9797578f44bbc51b1cd67ca53803e96b", 16),
                    new BigInteger("5559040a6083f2af1f9133ccaf5bc2ce06e56ddfc7dd410e9635c0116b62722", 16)),
            curve.createPoint(
                    new BigInteger("7f927b881f2cdc05e1a69e40bb714af47b630d1425f08ab5d574ee698f33d51", 16),
                    new BigInteger("26a465288e96572de303203bd38f4a03031e8158da0591cb037c0a5111d1056", 16)),
            curve.createPoint(
                    new BigInteger("36a65598552f8753580d1655417d645a140966e10a1e1663015f9fdfae44881", 16),
                    new BigInteger("33d5bbfaebf59eae72b89b1aea12ab2ba3c9617f8c3baed1ec16bdf668381b5", 16)),
            curve.createPoint(
                    new BigInteger("403becfa545c826782026ff409cc16c9d4fe428f1b5b6e630c92439d2fa5fd", 16),
                    new BigInteger("47bd6f2bf5d74f710ecb479c79b01fb774fbdad590e683a415cdedf33f71dc5", 16)),
            curve.createPoint(
                    new BigInteger("3a747826d241b877d3d56b16e0b810cf088eda4fd6048da174c9991a942a5eb", 16),
                    new BigInteger("2c7ba19b0a3486a2cdb84d4a388d34beb077a0e467ba44590166f93f6a09d2e", 16)),
            curve.createPoint(
                    new BigInteger("3d60cd375842714b37bda89dd1f13a7e0f3ff133b522209617d031bce05a537", 16),
                    new BigInteger("f77f216451ab01ad5226844d2162a7f32744688bcb4325445539e2ce5cec4", 16)),
            curve.createPoint(
                    new BigInteger("235bf66f67c9100e7f0e22bb299cdfaa603644b240e0770aec7e7fd163e2a65", 16),
                    new BigInteger("37110b3fa83ece3990afca2bea8d5ebb3c7aace60a0147f8e6ab733e2f2b4d5", 16)),
            curve.createPoint(
                    new BigInteger("3b796d4eb69a55471fa86108f787b3604874e92b6887a7667a6c2bfbbd9a42b", 16),
                    new BigInteger("4912d6dc0419732ef82cb3278415851d4e2d7ca89e0f4d7128cc9de51b810fe", 16)),
            curve.createPoint(
                    new BigInteger("48d53516dd51e49faa7ab46c8c10db1befd10f23c6a9d9bc3640a2f0da44518", 16),
                    new BigInteger("73a2fb3d064adadf21aa1362c04affc660598f38a9e069b3afb74d0a99ae9ee", 16)),
            curve.createPoint(
                    new BigInteger("48c32cff161ed145da0d5b73084897647abb777adf65738559ceab6939cf3e0", 16),
                    new BigInteger("3d99308978e828f857c382df32b472bda81e8ec8e30c8844077ba6d6d2ba903", 16)),
            curve.createPoint(
                    new BigInteger("2947ff091a8ec9684affbc9a62e09e598841c4a6dc638088492aa47dea57097", 16),
                    new BigInteger("19a2cc97975e547f97a4d02e42f89e6ced6f5a953cfccdec347867d26926541", 16)),
            curve.createPoint(
                    new BigInteger("1960d85f30475615f82484eba0bdafb7ea7cac3809f0518a757d66f02b01676", 16),
                    new BigInteger("36c8f77baabf0cc8805d993bbe62041fcf4e3239cf9d53278a4fbd91e75eeb7", 16)),
            curve.createPoint(
                    new BigInteger("2765f28074d21d5a055340b6d40092d2bbef807e02009fabfa08ec0b9bdf38b", 16),
                    new BigInteger("7fb189e0553d5df52b6843661814824b3f3cbebbd54988f042fb256c6bf30b", 16)),
            curve.createPoint(
                    new BigInteger("348836cb2aaa00212f4b1a4e2d7fc5417f246bf2fe5c9a16ebabda449e2e08a", 16),
                    new BigInteger("3f7276fd7d69e0d55ce5ee1d2d830534a27227fe0b6d8a36c93f9a78b872969", 16)),
            curve.createPoint(
                    new BigInteger("7afb9d34b6a42ea8c6d870e4b8191c274201dc1f93a1a2219a2392b7e345a31", 16),
                    new BigInteger("42bbc20dc7115e0758b364a110227b16b64ec58fc535ce5ff1a9ad8b8a09fdd", 16)),
            curve.createPoint(
                    new BigInteger("2cae0c2afee1767fd4c66f52e1f176d217e92e89cc19eb36d5a6c1715f641a", 16),
                    new BigInteger("5335efe2d9bc3667d25ea88bf76438a4d6ab9ba5c512f9da7d0529b79b62d83", 16)),
            curve.createPoint(
                    new BigInteger("1cc5fde334707723c3a06f00c106db88664284a2df47bb6b144d9f960aea3e2", 16),
                    new BigInteger("dbbf610d100316938bcd8bcd078513512ecb50d4579690dbefaa419c05980d", 16)),
            curve.createPoint(
                    new BigInteger("54e90cb8f3a2998d2675c5780679e06c0556b1e618f8fdf07f9a4b2466fbf1e", 16),
                    new BigInteger("16248676b6f06ec5e34994bc3115f85c8147b54f34d8500928f2fdc051e2089", 16)),
            curve.createPoint(
                    new BigInteger("525c70a2ba0dbdd68d75640f47f13d0d415ea595f7030f533f4625c2a46523b", 16),
                    new BigInteger("58292c8675e5e1a438f49e0c05648d9a7aa997f2f1fd77d5de1944afe5d7eea", 16)),
            curve.createPoint(
                    new BigInteger("54726d78d099007393348787a03107ab492e59690a46c87fb02ec554f2353bd", 16),
                    new BigInteger("53b54b77184ba75a3391e0ebfa6d6974db028f3f8e34bbd5460759a5848dd76", 16)),
            curve.createPoint(
                    new BigInteger("4ac81a66903537769d3aac6c483ccc08535cb767b6b5e1ec8017a7393ab70ae", 16),
                    new BigInteger("2cb22b77a8a05d26f11a4dec80eff292633aa05553a889c5ab16b6ac6e2ab17", 16)),
            curve.createPoint(
                    new BigInteger("21d0175349e21114988a2930b9a607d43245783cb4a0c984ce27f4c4206708", 16),
                    new BigInteger("59f1f49342cc5496213d3329bf4ca7fb0044337449c579bf53147a1dac9e67c", 16)),
            curve.createPoint(
                    new BigInteger("167f821b381f4c8adcc39789475fb55ba639e5124fe75f26dd61be396dd5e66", 16),
                    new BigInteger("22002c87d4cafb47ac9d27286d5cf5ff7a6715d69814118269b0729be9e4b3a", 16)),
            curve.createPoint(
                    new BigInteger("31010666c6db83a9f9e4db4c48173afd405783ac53852a6e38a8ff925528843", 16),
                    new BigInteger("1f466dc9b5d9094107c741dbf380f9fd98d8549cd50f67169901516f8cce74c", 16)),
            curve.createPoint(
                    new BigInteger("1ad3875769a5053388a86edc85dd80fdffbbda6a456aea497ff81a0f1f6707b", 16),
                    new BigInteger("2de7cdec5e2bad56a71bd2f33a4ae4c874e1ad4210a6ac32b443cfa34e85b1b", 16)),
            curve.createPoint(
                    new BigInteger("c489650fb7f459ce09cd05a456fc5a46b849b38a671298ed645bcdaab168b0", 16),
                    new BigInteger("45610d092b8af1c43ceed474cd17f7bbee65120aa6fa4d37f949e7e41f25327", 16)),
            curve.createPoint(
                    new BigInteger("394256a5ef4d7af5459587a0bd2edb8acaf5ecfef2563c9a04daf34a4abe4c6", 16),
                    new BigInteger("1ebee390dae1403c0c53994e1d064fa64e20fcb45392e209b2b99486a559ffd", 16)),
            curve.createPoint(
                    new BigInteger("410a1511fead6151e9bedb089b9832d0fe01fab76d3f8459929f767525aeb27", 16),
                    new BigInteger("361f0a5ffe09fcc3ad4eff3f5e89508ac247af80267100b69de3c59df561cfa", 16)),
            curve.createPoint(
                    new BigInteger("38cd437c9f659e110a869605c182ee9fdc26de36baf559d9229e258267bb734", 16),
                    new BigInteger("624b1128ea7739bf1cbd0e423af92a4884323c868d2ba0ee9d362946edee2d1", 16)),
            curve.createPoint(
                    new BigInteger("78b126e50b7042d2a019f95cb87a3213c664ca1bafe345999b1e9e2dac1e608", 16),
                    new BigInteger("19e398196b22f4488cbe854c614ad8c353839abc5ab3a4f3f5c03c16ba8a198", 16)),
            curve.createPoint(
                    new BigInteger("6d3a5ce91132f385a91823c5c8046c4b638f5fe63357424410d901457cdb867", 16),
                    new BigInteger("7b80bae16d2d487e122495174f7a70992bc5dafbed72bf84127ead7c57302bb", 16)),
            curve.createPoint(
                    new BigInteger("32d053a904dc4d88fbe7d0b96e0cbeca22a00aa5c79c753d52b0b60abf31602", 16),
                    new BigInteger("3af6a02e5cae6d6490354ae51185149e3fdb6d0d9caab90e95ff58aa0c40377", 16)),
            curve.createPoint(
                    new BigInteger("49b1fbff5bdb0aa6938b066dde0ed772c0d81f9eff52e7fe038b0ccbd78adb5", 16),
                    new BigInteger("1c6e57834eb14d507eed8b36c81ddf92fa91c242467061927a742fafa82b43d", 16)),
            curve.createPoint(
                    new BigInteger("2f28b8994ca6f234d9293d26196b43b9d1d5306844348c4a638102c05de85f5", 16),
                    new BigInteger("759cfb172eab065d477248b3569f4ff5791055f01e95fe71b94b8e615d73c96", 16)),
            curve.createPoint(
                    new BigInteger("3c2ee954ff534f856f59188fa0f29ed8a022aee0cac52d634f6dc58cd514d70", 16),
                    new BigInteger("22bd162e74925f0a876bd8a206b8767dfdd7c898576a73a490f138d9a7f99c6", 16)),
            curve.createPoint(
                    new BigInteger("5763a7cab001e1aaeabf9ab5b9b2fffe6cc2b299ab04ec4933da74d960e1ab", 16),
                    new BigInteger("715ee4f8ee93ab5a1dba00f0a6abc4eec47d49b61254cc27fc36a031e32f0f8", 16)),
            curve.createPoint(
                    new BigInteger("19976ad8d7b7f47c785408243a227401996b36e47c7a78a7bc7d4256233ba9a", 16),
                    new BigInteger("896b713c5d7777b0703821a73c1d9a4c3755501042120534ff13990975e1f5", 16)),
            curve.createPoint(
                    new BigInteger("61674b992c29827186cab5ff454758dbbed8e89bc23d0bd33193afccc3a04bc", 16),
                    new BigInteger("38e1020744c13903809ea30a0662fdb5226ae760cdcf10800faabec452e00f8", 16)),
            curve.createPoint(
                    new BigInteger("2ea2d48bcb83c0c9cda4efe11f07165cfcbc9ccd26526e5fb12556316d4b1df", 16),
                    new BigInteger("1d2d68b74ad384c5c4a9c85453104216357bfcdf635680b40215f0f800974cb", 16)),
            curve.createPoint(
                    new BigInteger("7881212050264c40c336ed3a15dd2cd868ec9a558f5b728869eab66e8b8ed54", 16),
                    new BigInteger("21aaefcc8ad8a161b8971d6880321781dbd939570c540da4c330922b8c81e9b", 16)),
            curve.createPoint(
                    new BigInteger("b6be88ce0461d20f59c5199573cda0170b61decf6e8e69a6d32f1695adc4ed", 16),
                    new BigInteger("5536e4808370716f2bb3423a9a49a38ddbfe91faf3b7a35eb53d3519238b6cf", 16)),
            curve.createPoint(
                    new BigInteger("e5972af1655eb6dde2e8c77cc58044299922441b5ee41ceaf5cafedc765bcc", 16),
                    new BigInteger("550282f37a4783dd60801c237045992d6fbe82a5902e7d837ea25f6f98c7b3a", 16)),
            curve.createPoint(
                    new BigInteger("7efc1aad1f580d8f50274f1c114c40056be19a8c96fa8c4cb5bf85e1e7f3e4", 16),
                    new BigInteger("2689f1c3898b114d668be6413643ee9f879913d40c262541fd0316264c60a4f", 16)),
            curve.createPoint(
                    new BigInteger("7939db98037f59b0113e9d60051f75ac9c3cfd1a3eb535c73e2d945068c6c5c", 16),
                    new BigInteger("410914ca8bbf3c65cdf3e9772ca790c19131c50068d34b7346c10260a578a8e", 16)),
            curve.createPoint(
                    new BigInteger("225b77ad00a2b83d26690190b74867326eca4f55bfbc3a13be036225ca3b1b5", 16),
                    new BigInteger("411faafef89042ce6beb64309fdaff70fa53e9d32d79a21e7f82f80e79ff05e", 16)),
            curve.createPoint(
                    new BigInteger("1501e64c99c8b6658b0479f2c05c9142d246eaabfccf2fcec8dc4399539d8e1", 16),
                    new BigInteger("3bab1e3339e42c9ee66c65b0b20236fdd9362d3ce786ad3a9779ab578af50a8", 16)),
            curve.createPoint(
                    new BigInteger("59b907b941f24fb8ea2458153e55f07534b388e835af7b69f3c9f54392a335", 16),
                    new BigInteger("1d5438c4f2f68a417f3d56f916d899a6ffe910f5f2989ca31687f1b10f60db8", 16)),
            curve.createPoint(
                    new BigInteger("2887d08a26f484546f360e33abbf7a998b7170a5b30070938b84f072c676bf3", 16),
                    new BigInteger("62a78e8d00e5d3a59e2fc424ffa08961567ba1ef24c8531cd7bceee6074a535", 16)),
            curve.createPoint(
                    new BigInteger("6e3cc8076b3d45377929033af35aab0c6d19ae4fd47c0daf844079ca04c46eb", 16),
                    new BigInteger("7b90f338e4d848aa8f19d0b5c3bca916a2a9024acbf14bddb278bca2aa39e5f", 16)),
            curve.createPoint(
                    new BigInteger("34844dacdd3ec54a3af328bb9d67715ab33425e194ac9977ca02ef22e8f7a88", 16),
                    new BigInteger("3c1affc6372f32a1634748124f9e1a03c4f0c993971da0dc28888b0801279d", 16)),
            curve.createPoint(
                    new BigInteger("436b192e03a49796cf9bc5e93c88268b71c9c24f9c3a85322bba634ebea309d", 16),
                    new BigInteger("67a8091ef69d62abcb28ce5df4dc7d53f8dc2b9690344f75ecd03a6d9386044", 16)),
            curve.createPoint(
                    new BigInteger("592d25b68baff87a6d7fd41ff0dadbddc1bd1316683de3b2d677501c0eb14e4", 16),
                    new BigInteger("27ad1e1099683f54589010faeefb19e38569ace43653be8787a42b0591e7bc5", 16)),
            curve.createPoint(
                    new BigInteger("89a5111ae911512ba62e87b97f643c0219702f235c70f62c6678a129302009", 16),
                    new BigInteger("557fa3d98e9ce7b83b47545013a4498f3de43787fb66b1a54521222242f7c1b", 16)),
            curve.createPoint(
                    new BigInteger("1c9b5e53377e72da5066cb08566bbf9ec31ec1877f455d932cd9b1aa375d34e", 16),
                    new BigInteger("72f79555a8bc207863f32d482fca54692825449fd8963fcea3de3a8183a739a", 16)),
            curve.createPoint(
                    new BigInteger("574a6e05eb14591729515be239ea8c1fa9e12d4049d42876f76c8ff37bca03", 16),
                    new BigInteger("5f99b3af43ca68c1c73e8190d5f73c8de162ba643d7d5f0cd73cfa8135db6d3", 16)),
            curve.createPoint(
                    new BigInteger("513fc5c2e16505b2b25a2f284e167d5401194bcac0dc3ecf8b7c9acb560daa1", 16),
                    new BigInteger("687ee7a1a8954d08d3856e1a16ded808e419e789736d3f55f79f7693bad69f5", 16)),
            curve.createPoint(
                    new BigInteger("53d48bd1205274b1c2b0a0ceb3d21c5fcd7c8892a784931603240b288a598b9", 16),
                    new BigInteger("35387abd7ea59c9b956de44d36533cad1f6668c438d666651695ff3862159be", 16)),
            curve.createPoint(
                    new BigInteger("213eb1ea99e08825110dd61094eb6e8145119dc1c507636f068730b1e086d44", 16),
                    new BigInteger("744f6853f4f02f4f042468d0739e0c9f64df720b87ed77d1979547084ef7a89", 16)),
            curve.createPoint(
                    new BigInteger("735ef017d091ca23264ad0aa7bb9b2be3309b4539605e79ed4a652ccb2fbe3c", 16),
                    new BigInteger("7f0ccc7a5747c4e921fff97d431169f690763427e2cfd1ad74d7a0308d7faa9", 16)),
            curve.createPoint(
                    new BigInteger("3f36babc5a30070b610ed97db44997e6d9115c9c0579ad8f75d295a17130001", 16),
                    new BigInteger("79047908a2474e32d5c712a07bf5c4ad522590bb5d6cefda410d30528e12ca8", 16)),
            curve.createPoint(
                    new BigInteger("51c04907ae88a5926b242fb2862cb1f2c651a94e6caad5bff8601c079fded74", 16),
                    new BigInteger("10a585a269f460aed43f54c7de13cdf623fc8de5957526997278be939ef32ad", 16)),
            curve.createPoint(
                    new BigInteger("c1e1bd626a735aa2c065831317217ecce68e377eb1f67e54ce2e97bc2ef2dc", 16),
                    new BigInteger("53c5af23a9b482f420be6dfd37b6886154cfd130794098e1f51c1885ac2556a", 16)),
            curve.createPoint(
                    new BigInteger("5aff3b30775ae4758e604a4a6262803a545f5ef4e7855fa245ac6a6431a9ece", 16),
                    new BigInteger("39a4799e5519047f29333bee9c86c99bfa8056d4aa381c396c4a44331fe795f", 16)),
            curve.createPoint(
                    new BigInteger("3d753e9723701a8e9d99b91bb93dee2eda7ffa5072fb2cd5c5fd99aebcdb299", 16),
                    new BigInteger("15798bf5c17d6d5880fed1553af32dd8d8baf2888c715a886575448a24c7975", 16)),
            curve.createPoint(
                    new BigInteger("6593e5078466b07a4222d2e544da826d2c583c9cc5f2eaea148b129b00d4aa0", 16),
                    new BigInteger("11b352b08a0a61d3cd67d1dc08069dec3bde907b3da0f56de5011b956bf8744", 16)),
            curve.createPoint(
                    new BigInteger("7a6eb353c5be9ff03fe4a06c01fb71aad2b38144179a291ebcbb2c2417cca65", 16),
                    new BigInteger("3de3ecb12f2fa699b46a9d399abf77ca17bebc3e491bfb2542dd0fba991e2bb", 16)),
            curve.createPoint(
                    new BigInteger("2c7ead583d6c32162091034a9eddfa775b4e84b8bdbea939edb2a80dcf64f6", 16),
                    new BigInteger("461790ce40d9c276d962b2a1e9a74d66e9d7335962e234e8a2fc6963d31722d", 16)),
            curve.createPoint(
                    new BigInteger("34285af023d9b4c2c2b88e8704bf2c05a9b553b00b2e70ff05f8c2970cb134f", 16),
                    new BigInteger("33fe678e7671760a83836107428dbade68c3593fbe568f3f8f1b2c568099c44", 16)),
            curve.createPoint(
                    new BigInteger("6222f720a24466263db6a11842f117fc4bb78da6705f140e48869db3e087441", 16),
                    new BigInteger("6eff5b9bf3aeedc962bc5a24b66e7bdad2153450ed53a058bf2c8dbf2907693", 16)),
            curve.createPoint(
                    new BigInteger("17c6ec5ea206eb97cbf53851e37ce391080e0d2bf1e5395610f79ab0503f7ce", 16),
                    new BigInteger("3adb71ca3523d88ceb1e365f12dfb24895453c14daf0046b2626cddadfdf5f7", 16)),
            curve.createPoint(
                    new BigInteger("70859f9771a713e54974ce11cdaf44b0dcc3e9befa0c0834908d877eeaafd27", 16),
                    new BigInteger("d18f794bf0cc0623b711e7450030424e52326c45ba9b03341883ae4828a5f8", 16)),
            curve.createPoint(
                    new BigInteger("2a820cfd0fd4ab0871e7b303cd545a3086caf8fa818c087a4017197da74efbf", 16),
                    new BigInteger("5f992683ff37f6c041b84bfc01503d333ac9763505cc8f69473da01812969d1", 16)),
            curve.createPoint(
                    new BigInteger("5b0526de2c07fe7cd73e3884f642d57a0ac5e13c68590ed03a14e530616e8c1", 16),
                    new BigInteger("eec69d0cbd92c9fca31ec967dba848bec368e792d6678797946a5e34fe3487", 16)),
            curve.createPoint(
                    new BigInteger("6cf6b3efee707210cb3a72f1e885c3d0953aefb43e5e148c740aa1641725c61", 16),
                    new BigInteger("911cb630b898e2c1a9115f9e45bafe3b819edfb1eab6e15612d14289939984", 16)),
            curve.createPoint(
                    new BigInteger("74e913de55f1e46143cb2ecfc580f8d3d3908f200281322b84e21c989cda293", 16),
                    new BigInteger("761d2736c9ac7670ba905bc2629c6c0dbe988820a4454ff415ba68710f7df92", 16)),
            curve.createPoint(
                    new BigInteger("44084305e0c911a40b7cbefe5f13cffe9a99375d1a584c4a2200958050af7a9", 16),
                    new BigInteger("249c83877371564708ea525b64b1e7e12785460d83364446531c9adcacba5f0", 16)),
            curve.createPoint(
                    new BigInteger("2bf71ad4d1bee1a67fb300477029f54bdb0e09f78bf2ac2e8afc7465a7adbcc", 16),
                    new BigInteger("6244dd6cad282539049be57487bfd9900bb0d5da805d02b535096368fcb4cd5", 16)),
            curve.createPoint(
                    new BigInteger("3a62d8f763b62def36e4089458046a49c5ecb91b861549530773e0548ff2bb", 16),
                    new BigInteger("6a10a03ba61e6ac657270465c09aa9526cf1ebe96bdecdf0e7000476a47b9eb", 16)),
            curve.createPoint(
                    new BigInteger("284eed3a17c51e0677d4fe897f056abe9def8af07a4630e6ca5723e2aa6677", 16),
                    new BigInteger("516a06ac1d5626ed03d2eee9de6f60f0311eca703a99b0fb31b9c66b01c27c7", 16)),
            curve.createPoint(
                    new BigInteger("2a2c63b16cccd685f731d06fe93ce2cffb358d34d03dda9a7368185c1eb0c32", 16),
                    new BigInteger("7180baca0ba81284809f92eca1654cd76b925a9242e5d5e0f18d0a55d13c6ec", 16)),
            curve.createPoint(
                    new BigInteger("5f9466017ec09769611389ea5370ad68dda936d3f5816c9e928ff9574abf9a7", 16),
                    new BigInteger("6619b5b145bb5f4f29deb7a4cd68ef4da3995312fa6537f0d01684da4267ece", 16)),
            curve.createPoint(
                    new BigInteger("74f229babe01b4962b3307589c1a13019134b1db6822698388bebb55d21c30f", 16),
                    new BigInteger("156ae857ab3279f754facba0db36398dffec8c31e5e160473198f2f891b7531", 16)),
            curve.createPoint(
                    new BigInteger("334b9fe3a5fd99bc966ddd1309698fd32afd1f235062f2c275b6616a185de45", 16),
                    new BigInteger("221a60053583cc0607f6f2e6966b62fc9dac00538bb7eb1148e007a92116d2", 16)),
            curve.createPoint(
                    new BigInteger("7ad710ba002a67c731efbaba2149d16fec5d2f7aa3d126fd9886172e9f4ea30", 16),
                    new BigInteger("3a10f8e902a7a13aec94d66415347e1314f9bac83a7db176096b809b25ffb86", 16)),
            curve.createPoint(
                    new BigInteger("4306dd0a184a3283c3097ff8f7434cec80912e9dc04b7df21ba73fda9f8e6d8", 16),
                    new BigInteger("6d42bd3d1a8dbddafd09e872e2aa3891ae79ec939dc1b382196bc21c4ab749", 16)),
            curve.createPoint(
                    new BigInteger("1c3f2124e1135c32a426d1d14e471edd9e0f2c7bd703ee123cbbd608e8c4be7", 16),
                    new BigInteger("3cc607a3c3f1ab68dd5fa56c65996002721b8ad8ad4b0dd9e5b1467d316583", 16)),
            curve.createPoint(
                    new BigInteger("294af33272ffcee0b56a436de1b73759cbddebef4c07888b42c2f92b0b68e1", 16),
                    new BigInteger("d837164311d5dca8d37b99ef9eb22708643c83d1cbdfe852f63ea07b06fbad", 16)),
            curve.createPoint(
                    new BigInteger("753bdb5439a19bbffdfa02b1dc24e8368f22d0a8276b109c11e6feb26f56f39", 16),
                    new BigInteger("6ed396231af93647633eab467f1a034f38e76823eb85baf97cae56e2dcd9f75", 16)),
            curve.createPoint(
                    new BigInteger("5674f0cb892b733fc0b50e121d8679afed0a925c32594cc65ffe83bebe7748e", 16),
                    new BigInteger("7fbf0325dd38dd94905adab2c52758552292a6a103d9edfcb11938828e828c8", 16)),
            curve.createPoint(
                    new BigInteger("4a8f053573a0a74251059d0229d89b6660407ba0b491779fd10f87a5117c81f", 16),
                    new BigInteger("21b70112485398bf67ec9d733df24a1df30dea718a93b786f41ed04e3ae3c5e", 16)),
            curve.createPoint(
                    new BigInteger("726c01ec4a08df8fc8de173311f50d4f3b97c5a9cf68c1536146f827db95ae8", 16),
                    new BigInteger("15013cafadefa7f1c4e4dfdd70bd4d3979dd18bd7f0332572ce2a3fd8773d12", 16)),
            curve.createPoint(
                    new BigInteger("38ac0fbfa98937257460db7e6645d7e5112b6fce7234813fc8a704e8ade8da2", 16),
                    new BigInteger("73c0109f86048aad08c443f781ae60ad13b99f7b9cfdf3128fe6d6eeb799a7b", 16)),
            curve.createPoint(
                    new BigInteger("6f6d3a38621582ace092eb50ecfe9eff265df141ebdcab8653299116fcea291", 16),
                    new BigInteger("4a1bf3f39bc919c8f1b720a0b1ce952cad17f2ba98308ee6b76dd9b6f3d7b75", 16)),
            curve.createPoint(
                    new BigInteger("6a307fc28e1df8d9ad01766419e097797d65cb674436fa1c8f012d3de2c2a1f", 16),
                    new BigInteger("26911a635ba824db004875d79dd84834a97ac12643e42829015bf88c1fd6f05", 16)),
            curve.createPoint(
                    new BigInteger("2a74860e3336d6db916555894cc8028f41508812925db1925457afe40257155", 16),
                    new BigInteger("5f8da573f4c39816ce2dba8a20224223a7cfec53117ec78973930c0e9b60244", 16)),
            curve.createPoint(
                    new BigInteger("4d2b49e1ed0799f719b8269f092cb489a466a645bc0ccabafdc678864c176d7", 16),
                    new BigInteger("5410083df7d256f18cbf5697ae5e52c31e075d8a3b27e21d6f5177ca882f6c1", 16)),
            curve.createPoint(
                    new BigInteger("110ecb9fbf6c333d168cee473cc5ad98809b6cb9eb5d1f6cd28ab5fab504fd3", 16),
                    new BigInteger("7e3c54d7533d9f8c3310f219dab0cc3ea4d39b418a748eeffd6bae2b8637a43", 16)),
            curve.createPoint(
                    new BigInteger("5be4d711b80da70e6d3ac493250bbfd16f20b25f31919b3a91cf14ffbac1096", 16),
                    new BigInteger("7f55a0919f082e8885f1515e83c5b39b6022404503507498e1b4422d79c43e2", 16)),
            curve.createPoint(
                    new BigInteger("2605125b95ca4ba93a21cbbba5762898a7cf9e988f07ab9e64cb3868e3b139d", 16),
                    new BigInteger("62f0ccf55b9fc0eaf9736fc8ee484e2acdbe259813af9803cf815829a5e9d3b", 16)),
            curve.createPoint(
                    new BigInteger("1092bbbf206f2a3068167c3dd99a72de31e206f6c504c071c8214d105ff814d", 16),
                    new BigInteger("309f489f68a62089f53b96df5d4fbc3ecc5a1a42eb7ece0e49bad17ad490ff4", 16)),
            curve.createPoint(
                    new BigInteger("2abdee9409d9c92559ca3f4e6bddd649c31aa09b90bfcb4a612af491241e18d", 16),
                    new BigInteger("3ffa8eac180a29de3f8a69efca84bac046f921f5725e96a6ff0530be1436aaf", 16)),
            curve.createPoint(
                    new BigInteger("376313f27d00bb1aae7ec991745efe6ee28c6b50de0c6cd9845cc4bb4f83543", 16),
                    new BigInteger("6a8e0a9389ba528b156fa94ac090a895d7b795818d4941c29415d9e2984c547", 16)),
            curve.createPoint(
                    new BigInteger("a80380c71bd466a696b3f0fbf02817c9459d9798f4f3899cf32edf647fe066", 16),
                    new BigInteger("6a09805e814e7cdfc76eba4b79f1df5ae559e0f0aba9f728d3cba4ea5c57471", 16)),
            curve.createPoint(
                    new BigInteger("223694b921d247d989a79b9b2b2f07496036c40cb043eab074a9d6a2cd2ffed", 16),
                    new BigInteger("c247217f1b1df35e30d9e15fdaadf42d6fb0edd3a5a7e265d4cdc426c120aa", 16)),
            curve.createPoint(
                    new BigInteger("102333620df278c6714bbc880fc087db58c1b9b4d77ed4d61b32a74bfc7c3e2", 16),
                    new BigInteger("6a77d37727ccf71c2caeb151faf4404d4b94e9047f9f0a7c3966367f3b53c65", 16)),
            curve.createPoint(
                    new BigInteger("891626f466536929ee7eadcd18b41925706dedab7528ed5f0f7abf039eb9d2", 16),
                    new BigInteger("5f73d11c141c933a35b2d0d06e5cbae614a20d17dc3b439f8bcdc3413c5ea37", 16)),
            curve.createPoint(
                    new BigInteger("215c23fd3f073f870e5e80303967391bf173f8adcdbeec72d131c557babc203", 16),
                    new BigInteger("10634332e9d9439a321597dc5b0fac9ff478834c3d6e281735f21a4a5e13266", 16)),
            curve.createPoint(
                    new BigInteger("21ea0bdc1332bc36e6aeb43be9071651c27e4ea2eadec636c8d818d4af72a36", 16),
                    new BigInteger("3a523d9643dccc6bb9c7c58413312caa3e60ba9c7c7f0177e0f3f469a3241e3", 16)),
            curve.createPoint(
                    new BigInteger("60deaed1bffb6190beed40caaf2bfab5e43d3707aff7ad3f278d571aa247eae", 16),
                    new BigInteger("e41f71ff254c1418e6a66992af307789fe04d6606fb2670900bb1a089fd879", 16)),
            curve.createPoint(
                    new BigInteger("1e1fac4a1646253fb1332fadc21fbdd3e3a24a840d129400f520ae4116a4cf5", 16),
                    new BigInteger("69c406f9f46576afad68808de0ab7e8922b6226af748e721d9097e21f1800f3", 16)),
            curve.createPoint(
                    new BigInteger("5db0ddcdf79ffe74d6454c12d2bc60b06776db03c75dc413f5be42ea9a91b5e", 16),
                    new BigInteger("134c3d6c699841f17306835bb193785228ffe7ab212a01a861c56b086a18cec", 16)),
            curve.createPoint(
                    new BigInteger("626814e320fb5bea505b248fd1c1389ad586c1cfe04923fe2f83173e915f4f8", 16),
                    new BigInteger("7ae407a926e887206a8b85cf485f1f327c9bb8ccbb6897024e2d122877d8ee0", 16)),
            curve.createPoint(
                    new BigInteger("23186237dc7d3b570cea645282ad4c359731bbfa54e7f036426bf6493812cd", 16),
                    new BigInteger("7d1fbab7e61a22d3b00993290d9f4cd5d820061573e787f66c2cff9a18e1eaf", 16)),
            curve.createPoint(
                    new BigInteger("54302dcb0e6cc1c6e44cca8f61a63bb2ca65048d53fb325d36ff12c49a58202", 16),
                    new BigInteger("1b77b3e37d13504b348046268d8ae25ce98ad783c25561a879dcc77e99c2426", 16)),
            curve.createPoint(
                    new BigInteger("13961b56b9fc0e412e468c385c22bd0680a25624ec211ffbb6bc877b2a6926c", 16),
                    new BigInteger("62f7f7792c77cd981fad13cb6863fe099c4d971c1374109185eae99943f16e9", 16)),
            curve.createPoint(
                    new BigInteger("47abd7308c70659af3f00fafe6837298af3cb530b6c2ba710ffd07a6bc1ae98", 16),
                    new BigInteger("75d0c8a7377aa9f0663d0c124a5659750847afabc29e39893fd27534a4a03cb", 16)),
            curve.createPoint(
                    new BigInteger("2c6276b764fb398fa555857dbe0ce0ec18fab7a233bf23851295739801f0585", 16),
                    new BigInteger("5d8f4897ce44007ec5bfcb9aeb78b8f6e1d40a514f72d213c9300d2770d2b8c", 16)));

    private ConstantPoints() {
    }
}
