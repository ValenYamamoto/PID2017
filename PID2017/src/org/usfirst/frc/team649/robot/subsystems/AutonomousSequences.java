package org.usfirst.frc.team649.robot.subsystems;

public class AutonomousSequences {
	
	/*
	* pos = defense location
	* originalDiff = the original difference when vision offset was calculated
	* x = current index of array used to calculate motor offset
	* 
	* returns the motor power offsets {left, right}
	*/
	public static double[] visionOffset(int pos, double originalDiff, int x){
		double[] error = {0.0, 0.0}; 
		
		//TODO fill in each function
		switch (pos){
			case 1:  			///LOW BAR
				
				break;
			case 2:				///POS 2
				
				break;
			case 3:				///POS 3
				
				break;
			case 4:				///POS 4
				
				break;
			case 5:				///POS 5
				
				break;
			default:
				error = new double[]{0.0, 0.0};
				break;	
		}
		
		return error;
	}
	
	
	
	public static double[][] fromPos1 = {
		{0.002, 0.0, 0.0, 0.0, 0.0, 0.0},
		{0.023, 0.0, 0.0, 0.0, 0.0, -9.375E-4},
		{0.048, 0.0, 0.0, 0.0, 0.0, 6.625000000000001E-4},
		{0.062, 0.0, 0.0, 0.0, 0.0, 0.00135},
		{0.082, 0.0, 0.0, 0.0, 0.0, 0.004675},
		{0.102, 0.0, 0.0, 0.0, 0.0, 0.0084125},
		{0.122, 0.0, 0.0, 0.0, 0.0, 0.0068125},
		{0.142, 0.0, 0.0, 0.0, 0.0, 0.0064},
		{0.169, 0.0, 0.0, 0.0, 0.0, 0.011362500000000001},
		{0.183, 0.0, 0.0, 0.0, 0.0, 0.011762500000000002},
		{0.202, 0.0, 0.0, 0.0, 0.0, 0.012525000000000001},
		{0.222, 0.0, 0.0, 0.0, 0.0, 0.011912500000000001},
		{0.242, 0.0, 0.0, 0.0, 0.0, 0.0073375},
		{0.263, 0.0, 0.0, 0.0, 0.0, 0.005725000000000001},
		{0.282, 0.0, 0.0, 0.0, 0.0, 0.004575},
		{0.302, 0.0, 0.0, 0.0, 0.0, 0.009425000000000001},
		{0.321, -0.022482893450635387, 0.022482893450635387, 0.0, 0.0, 0.010975000000000002},

		{0.361, -0.04594330400782014, 0.04594330400782014, -0.017180989583333337, 0.034361979166666674, 0.0128375},
		{0.381, -0.04594330400782014, 0.04594330400782014, 0.025771484375000007, 0.24053385416666673, 0.009575000000000002},
		{0.404, -0.06158357771260997, 0.06158357771260997, 0.06013346354166668, 0.8246875000000002, 0.014337500000000001},
		{0.422, -0.08504398826979472, 0.08504398826979472, 0.4123437500000001, 1.219850260416667, 0.014150000000000001},
		{0.441, -0.1241446725317693, 0.1241446725317693, 1.683736979166667, 2.2507096354166674, 0.0154},
		{0.461, -0.1241446725317693, 0.1241446725317693, 3.608007812500001, 4.011761067708334, 0.016175000000000002},
		{0.481, -0.16324535679374388, 0.16324535679374388, 6.236699218750001, 6.004755859375002, 0.023100000000000002},
		{0.501, -0.20234604105571846, 0.20234604105571846, 9.72444010416667, 8.238284505208336, 0.039775000000000005},
		{0.521, -0.24144672531769307, 0.24144672531769307, 13.650296223958337, 10.52335611979167, 0.0774625},
		{0.541, -0.2649071358748778, 0.2649071358748778, 17.885410156250003, 12.68816080729167, 0.1343125},
		{0.561, -0.3040078201368524, 0.3040078201368524, 20.98657877604167, 14.38907877604167, 0.17741250000000003},
		{0.581, -0.3040078201368524, 0.3040078201368524, 22.833535156250004, 16.304759114583337, 0.16411250000000002},
		{0.601, -0.3196480938416422, 0.3196480938416422, 24.895253906250005, 18.873317057291672, 0.117825},
		{0.621, -0.3587487781036168, 0.3587487781036168, 28.10809895833334, 22.352467447916673, 0.055837500000000005},
		{0.643, -0.3978494623655914, 0.3978494623655914, 32.68683268229167, 26.544628906250004, 0.016},
		{0.661, -0.42130987292277616, 0.42130987292277616, 37.23120442708334, 30.650885416666675, 0.0031875000000000002},
		{0.681, -0.4604105571847507, 0.4604105571847507, 42.71194010416668, 35.796591796875006, -0.003},
		{0.701, -0.4838709677419355, 0.4838709677419355, 48.76823893229168, 41.895843098958345, -0.014537500000000002},
		{0.721, -0.4995112414467253, 0.4995112414467253, 55.082252604166676, 48.338714192708345, -0.026200000000000005},
		{0.741, -0.52297165200391, 0.52297165200391, 62.71061197916668, 55.975664062500016, -0.036987500000000006},
		{0.762, -0.52297165200391, 0.52297165200391, 70.49360026041668, 63.767242838541684, -0.031900000000000005},
		{0.781, -0.52297165200391, 0.52297165200391, 78.37108398437502, 71.72204101562501, -0.019037500000000002},
		{0.801, -0.52297165200391, 0.52297165200391, 86.60936848958335, 80.25240234375002, -0.007925000000000001},
		{0.821, -0.5386119257086999, 0.5386119257086999, 95.83555989583336, 89.74489908854169, -0.007862500000000001},
		{0.841, -0.5386119257086999, 0.5386119257086999, 105.15624674479169, 99.22880533854169, -0.016987500000000003},
		{0.861, -0.5386119257086999, 0.5386119257086999, 114.86350585937502, 109.23673177083336, -0.0344375},
		{0.881, -0.5386119257086999, 0.5386119257086999, 125.52430989583335, 119.85458333333337, -0.057075},
		{0.901, -0.5386119257086999, 0.5386119257086999, 136.5974576822917, 130.7988736979167, -0.084875},
		{0.921, -0.5386119257086999, 0.5386119257086999, 147.6791959635417, 141.8548404947917, -0.11747500000000001},
		{0.941, -0.5386119257086999, 0.5386119257086999, 158.57194335937504, 152.89362630208336, -0.15132500000000002},
		{0.961, -0.5386119257086999, 0.5386119257086999, 170.13474934895837, 164.38770833333336, -0.1881375},
		{0.982, -0.5386119257086999, 0.5386119257086999, 182.4191569010417, 176.4659440104167, -0.2214875},
		{1.011, -0.5386119257086999, 0.5386119257086999, 200.88013020833338, 194.66920247395836, -0.27777500000000005},
		{1.022, -0.5386119257086999, 0.5386119257086999, 207.40890625000006, 201.03475911458338, -0.2852},
		{1.041, -0.5386119257086999, 0.5386119257086999, 219.83076171875004, 213.00990885416672, -0.30225},
		{1.061, -0.5386119257086999, 0.5386119257086999, 232.61341796875004, 225.58639322916673, -0.31386250000000004},
		{1.081, -0.5386119257086999, 0.5386119257086999, 245.3015787760417, 238.11992513020837, -0.32520000000000004},
		{1.109, -0.5386119257086999, 0.5386119257086999, 263.4275227864584, 255.96238281250007, -0.3619875},
		{1.131, -0.5386119257086999, 0.5386119257086999, 277.91968750000007, 270.17106119791674, -0.3942375},
		{1.152, -0.4760508308895406, 0.6011730205278593, 291.2864973958334, 284.1907486979167, -0.41570000000000007},
		{1.173, -0.45943304007820135, 0.6177908113391984, 304.03479166666676, 298.3736555989584, -0.43935},
		{1.19, -0.4359726295210166, 0.6412512218963832, 314.3691569010417, 309.9965950520834, -0.4486375000000001},
		{1.211, -0.4359726295210166, 0.6412512218963832, 327.2634895833334, 325.02996093750005, -0.4198875000000001},
		{1.249, -0.4359726295210166, 0.6412512218963832, 351.14506510416675, 352.63122070312505, -0.2203125},
		{1.306, -0.4359726295210166, 0.6412512218963832, 387.67184895833344, 394.98236002604176, 0.3564625},
		{1.329, -0.4359726295210166, 0.6412512218963832, 401.6485839843751, 411.57919596354174, 0.5585249999999999},
		{1.351, -0.4359726295210166, 0.6412512218963832, 414.9208984375001, 427.3427539062501, 0.7742375000000001},
		{1.373, -0.4203323558162268, 0.656891495601173, 428.2189843750001, 443.3726171875001, 0.9803250000000001},
		{1.386, -0.3655913978494624, 0.6021505376344086, 436.1566015625001, 453.3719531250001, 1.1133},
		{1.407, -0.3655913978494624, 0.5786901270772239, 448.79321940104177, 469.50490234375013, 1.326025},
		{1.423, -0.3655913978494624, 0.5786901270772239, 457.1603613281251, 480.6381835937501, 1.4314750000000003},
		{1.449, -0.32649071358748777, 0.5630498533724341, 471.14568684895846, 499.7434440104168, 1.6528625000000001},
		{1.471, -0.32649071358748777, 0.5630498533724341, 482.1071582031251, 515.1977441406251, 1.7167375000000002},
		{1.507, -0.32649071358748777, 0.5630498533724341, 499.88089192708344, 540.7372851562501, 1.9169625000000001},
		{1.522, -0.32649071358748777, 0.5630498533724341, 507.5951562500001, 551.3723177083334, 2.0303750000000003},
		{1.541, -0.30303030303030304, 0.5395894428152492, 518.1958268229167, 565.1256998697918, 2.1913875000000003},
		{1.561, -0.30303030303030304, 0.5395894428152492, 528.9597167968751, 578.4409667968752, 2.3902375},
		{1.581, -0.30303030303030304, 0.5395894428152492, 541.0637239583334, 592.5637402343751, 2.6319125000000003},
		{1.601, -0.30303030303030304, 0.5395894428152492, 552.4547200520834, 606.0336360677085, 2.9130375000000006},
		{1.621, -0.30303030303030304, 0.5395894428152492, 564.1377929687501, 619.7870182291668, 3.188875},
		{1.642, -0.30303030303030304, 0.5395894428152492, 575.2968457031251, 633.6005338541668, 3.4617625000000003},
		{1.661, -0.30303030303030304, 0.5395894428152492, 586.0779166666669, 646.8986197916668, 3.7399125000000004},
		{1.681, -0.30303030303030304, 0.5395894428152492, 596.7730826822918, 659.9819433593751, 3.9914375},
		{1.701, -0.3978494623655914, 0.4447702834799609, 607.9063639322918, 672.7388281250002, 4.248400000000001},
		{1.721, -0.42130987292277616, 0.42130987292277616, 619.7097037760418, 684.6023014322918, 4.52325},
		{1.742, -0.42130987292277616, 0.42130987292277616, 631.9167968750002, 696.0276595052085, 4.7670125},
		{1.761, -0.42130987292277616, 0.42130987292277616, 643.7115462239585, 706.6455110677085, 4.9647250000000005},
		{1.781, -0.42130987292277616, 0.42130987292277616, 656.0045442708334, 717.9420117187501, 5.1557},
		{1.802, -0.42130987292277616, 0.42130987292277616, 668.9933723958335, 729.6680371093752, 5.305925},
		{1.821, -0.42130987292277616, 0.42130987292277616, 680.7881217447919, 740.6380989583334, 5.40875},
		{1.841, -0.42130987292277616, 0.42130987292277616, 693.3044726562501, 752.0205045572918, 5.4857000000000005},
		{1.861, -0.42130987292277616, 0.42130987292277616, 705.6747851562502, 763.0421093750002, 5.555162500000001},
		{1.881, -0.3978494623655914, 0.3978494623655914, 717.6499348958334, 773.8059993489585, 5.6130625},
		{1.901, -0.3978494623655914, 0.3978494623655914, 729.9171614583335, 784.5011653645835, 5.647212500000001},
		{1.922, -0.3978494623655914, 0.3978494623655914, 741.4370149739585, 795.0159309895835, 5.6645},
		{1.942, -0.3978494623655914, 0.3978494623655914, 752.8451920572918, 805.7540494791668, 5.663775},
		{1.961, -0.3978494623655914, 0.3978494623655914, 762.3205078125002, 815.1176888020835, 5.631375},
		{1.981, -0.3978494623655914, 0.3978494623655914, 772.2167578125002, 825.0311197916668, 5.5775500000000005},
		{2.001, -0.3978494623655914, 0.3978494623655914, 782.5854850260419, 835.1163606770835, 5.5145},
		{2.021, -0.3978494623655914, 0.3978494623655914, 793.0572981770836, 845.0899251302085, 5.458150000000001},
		{2.041, -0.3978494623655914, 0.3978494623655914, 803.6751497395835, 855.1236230468752, 5.409462500000001},
		{2.064, -0.3978494623655914, 0.3978494623655914, 815.9681477864585, 866.6606575520835, 5.363625},
		{2.082, -0.3978494623655914, 0.3978494623655914, 824.9538053385419, 875.2425618489585, 5.325737500000001},
		{2.101, -0.3978494623655914, 0.3978494623655914, 835.1421321614586, 884.8896875000002, 5.276775000000001},
		{2.121, -0.3978494623655914, 0.3978494623655914, 845.4507259114586, 894.8117089843752, 5.224175000000001},
		{2.141, -0.3978494623655914, 0.3978494623655914, 855.6562337239585, 904.7680924479168, 5.1669125000000005},
		{2.161, -0.3978494623655914, 0.3978494623655914, 865.8016080729169, 914.4066276041668, 5.1078375000000005},
		{2.181, -0.3978494623655914, 0.3978494623655914, 876.0930208333335, 924.3716015625002, 5.0649375},
		{2.201, -0.3978494623655914, 0.3978494623655914, 886.6851009114586, 934.1905371093752, 5.0278625},
		{2.221, -0.3978494623655914, 0.3978494623655914, 897.0194661458336, 944.0867871093752, 4.984},
		{2.242, -0.3978494623655914, 0.3978494623655914, 907.5428222656252, 954.0431705729169, 4.924925},
		{2.261, -0.3978494623655914, 0.3978494623655914, 917.5163867187503, 963.5700292968752, 4.86725},
		{2.281, -0.3978494623655914, 0.3978494623655914, 927.8077994791669, 973.2601074218752, 4.810087500000001},
		{2.301, -0.3978494623655914, 0.3978494623655914, 938.1765266927085, 982.9587760416669, 4.7615125},
		{2.321, -0.3978494623655914, 0.3978494623655914, 948.4679394531253, 992.8120735677086, 4.7185375},
		{2.342, -0.3978494623655914, 0.3978494623655914, 958.9912955729169, 1002.9918098958335, 4.6872625},
		{2.362, -0.4838709677419355, 0.4838709677419355, 969.4716992187502, 1013.0255078125002, 4.671475},
		{2.381, -0.4838709677419355, 0.4838709677419355, 979.9091503906252, 1023.2481966145835, 4.6601375},
		{2.402, -0.4838709677419355, 0.4838709677419355, 991.6179947916669, 1034.5446972656252, 4.6485875000000005},
		{2.421, -0.4838709677419355, 0.4838709677419355, 1002.3389322916669, 1044.8447005208336, 4.6331500000000005},
		{2.441, -0.4995112414467253, 0.4995112414467253, 1013.3433561197919, 1055.5914095052085, 4.6207875000000005},
		{2.462, -0.52297165200391, 0.52297165200391, 1024.528180338542, 1066.6817382812503, 4.6098625},
		{2.481, -0.52297165200391, 0.52297165200391, 1035.7817285156252, 1077.978238932292, 4.5925875000000005},
		{2.501, -0.52297165200391, 0.52297165200391, 1046.717428385417, 1088.9397102864586, 4.568600000000001},
		{2.521, -0.52297165200391, 0.52297165200391, 1058.598082682292, 1100.8203645833337, 4.5470749999999995},
		{2.541, -0.52297165200391, 0.52297165200391, 1069.8258593750002, 1112.1340462239586, 4.52545},
		{2.562, -0.52297165200391, 0.52297165200391, 1082.2648958333336, 1124.6160351562503, 4.4980875000000005},
		{2.581, -0.52297165200391, 0.52297165200391, 1093.7589778645836, 1135.9812597656253, 4.4666250000000005},
		{2.601, -0.52297165200391, 0.52297165200391, 1106.1378808593752, 1147.922047526042, 4.4425125},
		{2.621, -0.52297165200391, 0.52297165200391, 1118.8518131510418, 1160.1806835937502, 4.4145625},
		{2.642, -0.52297165200391, 0.52297165200391, 1132.0897656250002, 1172.9032063802085, 4.370550000000001},
		{2.661, -0.52297165200391, 0.52297165200391, 1143.9790104166668, 1184.6550032552086, 4.3342875},
		{2.682, -0.52297165200391, 0.52297165200391, 1157.0279720052085, 1197.3947070312502, 4.282337500000001},
		{2.701, -0.5386119257086999, 0.5386119257086999, 1169.235065104167, 1209.2839518229168, 4.235837500000001},
		{2.722, -0.5386119257086999, 0.5386119257086999, 1183.641324869792, 1223.0802864583336, 4.190125},
		{2.741, -0.5386119257086999, 0.5386119257086999, 1196.7761914062503, 1235.5622753906252, 4.154837500000001},
		{2.762, -0.5386119257086999, 0.5386119257086999, 1210.366354166667, 1248.6370084635419, 4.1186875},
		{2.781, -0.5386119257086999, 0.5386119257086999, 1223.587125651042, 1261.445436197917, 4.070125},
		{2.803, -0.5386119257086999, 0.5386119257086999, 1237.9504329427086, 1275.3190852864586, 4.0161500000000006},
		{2.823, -0.5386119257086999, 0.5386119257086999, 1251.265699869792, 1288.1103320312502, 3.981375},
		{2.841, -0.5620723362658846, 0.5151515151515151, 1264.151442057292, 1300.0597102864585, 3.9522875000000006},
		{2.861, -0.5855327468230694, 0.4916911045943304, 1278.531930338542, 1312.8767285156252, 3.9152375000000004},
		{2.881, -0.5855327468230694, 0.4916911045943304, 1292.3798079427086, 1325.0752311197919, 3.8594625000000002},
		{2.901, -0.6011730205278593, 0.4760508308895406, 1306.3823144531252, 1337.471315104167, 3.770325},
		{2.921, -0.6011730205278593, 0.4760508308895406, 1320.6768977864585, 1350.1852473958336, 3.6620250000000003},
		{2.942, -0.6011730205278593, 0.4760508308895406, 1335.796168619792, 1363.4919238281252, 3.5184750000000005},
		{2.961, -0.6011730205278593, 0.4760508308895406, 1349.4894173177086, 1375.5787500000004, 3.3668375000000004},
		{2.982, -0.6011730205278593, 0.4760508308895406, 1364.170572916667, 1388.7136165364586, 3.18325},
		{3.003, -0.6011730205278593, 0.4760508308895406, 1379.092262369792, 1402.028883463542, 2.9861875},
		{3.023, -0.6011730205278593, 0.4760508308895406, 1393.6703320312504, 1414.7256347656253, 2.793175},
		{3.043, -0.624633431085044, 0.4995112414467253, 1408.5834309895836, 1427.6113769531253, 2.5818125},
		{3.061, -0.624633431085044, 0.4995112414467253, 1422.9209667968753, 1439.9988704427087, 2.3981624999999998},
		{3.082, -0.624633431085044, 0.4995112414467253, 1438.2721809895836, 1453.3484993489587, 2.1870374999999997},
		{3.101, -0.624633431085044, 0.4995112414467253, 1452.798707682292, 1466.0108886718754, 1.9814500000000002},
		{3.122, -0.624633431085044, 0.4995112414467253, 1468.2272363281254, 1479.343336588542, 1.7531},
		{3.143, -0.624633431085044, 0.4995112414467253, 1484.3086425781253, 1493.0967187500003, 1.5448625000000002},
		{3.162, -0.624633431085044, 0.4995112414467253, 1498.9124837239588, 1505.2522688802087, 1.3611125000000002},
		{3.182, -0.624633431085044, 0.4995112414467253, 1513.7310872395838, 1517.8373437500004, 1.1761000000000001},
		{3.201, -0.624633431085044, 0.4995112414467253, 1528.3778808593754, 1530.3880566406253, 0.9969125000000001},
		{3.221, -0.624633431085044, 0.4995112414467253, 1544.442106119792, 1543.926676432292, 0.7984625000000001},
		{3.242, -0.624633431085044, 0.4995112414467253, 1559.930768229167, 1557.3450292968753, 0.61625},
		{3.262, -0.624633431085044, 0.4995112414467253, 1575.445201822917, 1570.986735026042, 0.453425},
		{3.281, -0.624633431085044, 0.4995112414467253, 1590.134947916667, 1583.9412011718753, 0.28635000000000005},
		{3.305, -0.624633431085044, 0.4995112414467253, 1607.6939192708337, 1599.593082682292, 0.09267500000000001},
		{3.321, -0.624633431085044, 0.4995112414467253, 1620.210270182292, 1610.8895833333338, -0.0727875},
		{3.341, -0.5620723362658846, 0.5620723362658846, 1634.9343782552087, 1624.7718229166671, -0.258625},
		{3.361, -0.5620723362658846, 0.5620723362658846, 1649.460904947917, 1639.0578157552086, -0.43867500000000004},
		{3.381, -0.4995112414467253, 0.4995112414467253, 1663.0854296875004, 1652.8283789062505, -0.5947375},
		{3.402, -0.4995112414467253, 0.4995112414467253, 1677.912623697917, 1667.191686197917, -0.7566625},
		{3.421, -0.4604105571847507, 0.4838709677419355, 1691.5972819010422, 1680.4124576822921, -0.8795750000000001},
		{3.442, -0.4604105571847507, 0.4604105571847507, 1706.2784375000003, 1694.1057063802086, -0.9927250000000001},
		{3.461, -0.4447702834799609, 0.4447702834799609, 1719.275856119792, 1706.518971354167, -1.059825},
		{3.481, -0.4447702834799609, 0.4447702834799609, 1732.625485026042, 1719.3359895833337, -1.1380750000000002},
		{3.501, -0.42130987292277616, 0.42130987292277616, 1745.5971321614588, 1731.7750260416672, -1.2202750000000002},
		{3.521, -0.38220918866080156, 0.38220918866080156, 1758.7148177083338, 1744.4288248697922, -1.2945500000000003},
		{3.543, -0.3196480938416422, 0.3196480938416422, 1771.7895507812505, 1757.3747005208338, -1.3773875},
		{3.561, -0.17888563049853373, 0.17888563049853373, 1780.9899707031254, 1766.7297493489586, -1.4608500000000002},
		{3.581, -0.06158357771260997, 0.06158357771260997, 1788.1029003906253, 1774.5900520833338, -1.5845},
		{3.602, 0.0, 0.0, 1794.2536946614587, 1780.0621972656254, -1.7019375},
		{3.622, 0.0, 0.0, 1799.9835546875004, 1785.637428385417, -1.8343625000000001},
		{3.642, 0.0, 0.0, 1807.053531901042, 1792.776129557292, -1.9812},
		{3.661, 0.0, 0.0, 1816.1594563802087, 1801.8648730468753, -2.1514375},
		{3.681, 0.0, 0.0, 1826.7773079427088, 1811.9329329427087, -2.2609000000000004}

	};

	public static double[][] fromPos2 = {
			{0,0,0,0,0},
			{0,0,0,0,0}
	};
	public static double[][] fromPos3 = {
			{0,0,0,0,0},
			{0,0,0,0,0}
	};
	public static double[][] fromPos4 = {
			{0,0,0,0,0},
			{0,0,0,0,0}
	};
	public static double[][] fromPos5 = {
			{0,0,0,0,0},
			{0,0,0,0,0}
	};
	
}
