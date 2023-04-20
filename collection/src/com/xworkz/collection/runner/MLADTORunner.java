package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collection.dto.MLADTO;

public class MLADTORunner {

	public static void main(String[] args) {

		Collection<MLADTO> mLADTOs = new ArrayList<>();
		mLADTOs.add(new MLADTO("Shashikala Annasaheb jolle", 45, "Nippani", "Bharatiy janata ", true, "Female"));
		mLADTOs.add(new MLADTO("Ganesh Hukkeri", 54, "Chikkodi Sadalga", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Mahesh Kumathalli", 67, "Athani", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Srimant Patil", 56, "Kagwad", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("P. Patil", 55, "Kudachi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Duryodhan Mahalingappa Aihole", 56, "Raibag", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Vacant", 66, "Hukkeri", "-------", true, "----"));
		mLADTOs.add(new MLADTO("Balachandra Jarkiholi", 65, "Arabhavi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Ramesh Jarkiholi", 76, "Gokak", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Satish Jarkiholi", 53, "Yemkanmardi", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Anil S Benake", 63, "Belagavi Uttar", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Laxmi", 56, "Belagavi Rural", "Congress", true, "Female"));
		mLADTOs.add(new MLADTO("Anjali Nimbalkar", 61, "Khanapur", "Congress", true, "Female"));
		mLADTOs.add(new MLADTO("Abhay Patil", 62, "Belgavi Dakshin", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("D.M.Basavaraj", 63, "Kittur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Mahantesh Kaujalagi", 64, "Bhailuhongal", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Vacant", 65, "Saundatti Yellamma", "------", true, "----"));
		mLADTOs.add(new MLADTO("Mahadevappa Yadavad", 66, "Ramadurga", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Govind M.Karjol", 66, "Mudhol", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Siddu Savadi", 67, "Terdal", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Anand Nyamagoud", 68, "Jamakhandi", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Muragesh Nirani", 69, "Bilgi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Siddaramaiah", 70, "Badami", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Veerabhaddrayya", 51, "Bagalkot", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Doddanagowda Patil", 52, "Hungund", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("A.S.Patil", 53, "Muddebihal", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Somanagouda Patil", 54, "Devara Hipparagi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Shivanand Patil", 55, "Basavan Bagevadi", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("M.B.Patil", 56, "Babaleshwar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Basanagouda Patil", 57, "Bijapur City", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Devanand Chavan", 58, "Nagathan", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Y.V.Patil", 59, "indi", "Congress", true, "male"));
		mLADTOs.add(new MLADTO(" Ramesh Bhushanur", 60, "Sindagi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("M.Y.Patil", 61, "Afzalpur", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Ajay Singh", 62, "Jevargi", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Narasimhanayak", 63, "Shorapur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Sharanabasappa Darshanapur", 64, "Shahapur", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Venkatreddy Mudnal", 65, "Yadgir", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Naganagowda Kandukar", 66, "Gurmitkal", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Priyanka M.Kharge", 67, "chittapur", "Congress", true, "Female"));
		mLADTOs.add(new MLADTO("Rajkumar Patil", 68, "Sedam", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Avinash jadhav", 69, "Chincholi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Basaraj mattimud", 70, "Gulbarga Rural", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Dattatraya Patil", 51, "Gulbarga Dakshin", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Kaneez Fatima", 52, "Gulbarga Uttar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Guttedar Rukmayya", 53, "Aland", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Sharanu salagar", 54, "Basavakalyan", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Rajshekar Patil", 55, "Homnabad", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Bandeppa Kashempur", 56, "Bidar South", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Rahim Khan", 57, "Bidar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Eshwara Khandre", 58, "Bhalki", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Prabhu Chavhan", 59, "Aurad", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Basanagouda Daddal", 60, "Raichur Rural", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Dr.Shivaraj Patil", 61, "Raichur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Raja Venkatappa Nayak", 62, "Manvi", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Shivanagouda naik", 63, "Devadurga", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("D.S.Hoolageri", 64, "Lingsugur", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Venkatrao Nadagouda", 65, "Sindhanur", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Basugouda Turvihal", 66, "Maski", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("amaregouda Patil", 67, "Kushtagi", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Basavaj Dhadesugur", 68, "Kanakagiri", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Paranna Munavalli", 69, "Gangawati", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Arch Halappa Basappa", 70, "Yelburga", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("K.Raghavendra Hitnal", 51, "Koppal", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Ramappa Lamani", 52, "Shirahatti", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("H.K.Patil", 53, "Gadag", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Kalakappa Bandi", 54, "Ron", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("C.C.Patil", 55, "Nargund", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Shankar Patil", 56, "Navalgund", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Kusuma Shivalli", 57, "Kundgol", "Congress", true, "Female"));
		mLADTOs.add(new MLADTO("Amrupayyappa Desai", 58, "Dharvad", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Abbayya Prasad", 59, "Hubli-Dharwad-East", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Jagadish Shettar", 60, "Hubli-Dharwad-Central", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Aravind Bellad", 61, "Hubli-Dharwad-West", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("C.M.Nimbannavar", 62, "Kalghatgi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("R.V.Deshapande", 63, "Haliyal", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Roopali", 64, "Karwar", "Bharatiya Janata", true, "Female"));
		mLADTOs.add(new MLADTO("Dinakar Shetty", 65, "Kumta", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Sunil Biliya Naik", 66, "Bhatkal", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Vishweshwae Hegde Kageri", 67, "Sirsi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Arbail Shivaram Hebbar", 68, "Yellapur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Srinivas Mane", 69, "Hangal", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Basavaraj Bommai", 70, "Shiggaon", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Neharu Olekar", 51, "Haveri(SC)", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Ballary Virupakshappa Rudrappa", 52, "Byadgi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("B.C.Patil", 53, "Hirekerur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Arunkumar Guththur", 54, "Ranibennur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("P.T.Parameshwar Naik", 55, "Hadagalli", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("L.B.P Bheemanaik", 56, "Hagaribommanahalli", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Anand Singe", 57, "Vijayanagara", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("J.N.Ganesh", 58, "Kampli", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("M.S.Somalingappa", 59, "Siruguppa", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("B.Nagendra", 60, "Bellary Rural", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("G.Someshekara Reddy", 61, "Bellary City", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("E.Tukaram", 62, "Sandur", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Vacant", 63, "Kudligi", "------", true, "-----"));
		mLADTOs.add(new MLADTO("B.Sreeramulu", 64, "Molakalmuru", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("T.Raghumurthy", 65, "Challakere", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("G.H.Thippareddy", 66, "Chitradurga", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Poornima Krishnappa", 67, "Hiriyur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Gulhatty D.Shekhar", 68, "Hosadurga", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("M.Chandrappa", 69, "Holalkere", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("S.V.ramachandra", 70, "Jagalur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("S.Ramappa", 51, "Harihar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("S.A.Ravindrranath", 52, "Davanagere North", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Shivashankappa", 53, "Davanagere South", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("N.Linganna", 54, "Mayakonda", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Veerupakshappa", 55, "Channagiri", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("M.P.Renukacharya", 56, "Honnali", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("K.B.Ashok Naik", 57, "Shimoga Rural", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("B.k.Sangamesh", 58, "Bhadravati", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("K.S.Eshwarappa", 59, "Shimoga", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Araga Jnanendra", 60, "Tirthahalli", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("B.S.Yeddyurappa", 61, "Shikaripura", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Kumar Bangarappa", 62, "Soraba", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Hartalu Halappa", 63, "Sagar", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("B.M.Sukumar Shetty", 64, "Baindur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Halady Srinivas Shetty", 65, "Kundapura", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("K.Raghupati Bhat", 66, "Udupi", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Lalaji Mendon", 67, "Kapu", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("V.Sunil Kumar", 68, "Karkal", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("T.D.Rajegowda", 69, "Sringeri", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("M.P.Kumaraswamy", 70, "Mudigere", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("C.T.Ravi", 41, "Chikmagalur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("D.S.Suresh", 42, "Tarikeri", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Belliprakash", 43, "Kadur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("J.C.Madhuswamy", 44, "Chiknayanhalli", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("B.C.Nagesh", 45, "Tipur", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Jayaram A S", 46, "Turuvekere", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Dr.H.D.Ranganath", 47, "Kunigal", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("G.B.Jyothi Ganesh", 48, "Tumkur City", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("D.C.Gowrishankar", 49, "Tumkur Rural", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Dr.G.Parameshwar", 50, "Koratagere", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Vacant", 51, "Gubbi", "------", true, "------"));
		mLADTOs.add(new MLADTO("C.M.Rajesh Gowda", 52, "Sira", "Bharatiya Janata", true, "male"));
		mLADTOs.add(new MLADTO("Venkata Ramanappa", 53, "Pavagada", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("M.V.Veerabhadraiah", 54, "Madhugiri", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("N. H. Shivashankara Reddy", 55, "Gauribidanur", "Congress", true, "male"));

		mLADTOs.add(new MLADTO("S. N. Subbareddy", 56, "Bagepalli", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("K. Sudhakar", 57, "	Chikkaballapur", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("V. Muniyappa", 58, "Sidlaghatta", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("J. K. Krishnareddy", 59, "Chintamani", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("	K. R. Ramesh Kumar", 60, "	Srinivasapur", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("H. Nagesh", 61, "Mulbagal", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("M. Roopakala", 62, "Kolar Gold Field", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("S. N. Narayanaswamy K. M", 63, "Bangarapet", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("K. Srinivasa Gowda", 64, "Kolar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("K. Y. Nanjegowda", 65, "Malur", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("S. R. Vishwanath", 66, "Yelahanka", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("	Byrathi Basavaraj", 67, "K. R. Pura", "	Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Krishna Byre Gowda", 68, "Byatarayanapura", "Congress", true, "male"));

		mLADTOs.add(new MLADTO("S. T. Somashekar", 69, "	Yeshwanthpur", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Munirathna", 70, "Rajarajeshwari Nagar", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("R. Manjunatha", 41, "Dasarahalli", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("K. Gopalaiah", 42, "Mahalakshmi Layout", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Dr. C.N. Ashwath Narayan", 43, "Malleshwaram", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Byrathi Suresh", 44, "Hebbal", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Akhanda Srinivas Murthy", 45, "Pulakeshinagar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("K. J. George", 46, "Sarvagnanagar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("S. Raghu", 47, "C. V. Raman Nagar", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Rizwan Arshad", 48, "Shivajinagar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("N. A. Haris", 49, "Shanti Nagar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Dinesh Gundu Rao", 50, "Gandhi Nagar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("S. Suresh Kumar", 51, "Rajaji Nagar", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("V. Somanna", 52, "Govindraj Nagar", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("M. Krishnappa", 53, "Vijay Nagar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Zameer Ahmed Khan", 54, "Chamrajpet", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Uday B. Garudachar", 55, "Chickpet", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("L. A. Ravi Subramanya", 56, "	Basavanagudi", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("R. Ashoka", 57, "Padmanaba Nagar", "Bharatiya Janata Party", true, "male"));

		mLADTOs.add(new MLADTO("Ramalinga Reddy", 58, "B.T.M. Layout", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Soumya Reddy", 59, "Jayanagar", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Aravind Limbavali", 60, "Mahadevapura", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("M Satish Reddy", 61, "Bommanahalli", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("M. Krishnappa", 62, "Bangalore South", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("B.Shivanna", 63, "Anekal", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Sharath Kumar Bachegowda", 64, "Hoskote", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Nisarga Narayanaswamy L.N", 65, "Devanahalli", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("T. Venkataramanaiah", 66, "Doddaballapur", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Dr. K. Srinavasamurthy", 67, "Nelamangala", " Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("A. Manjunath", 68, "Magadi", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Anitha Kumaraswamy", 69, "Ramanagar", "Janata Dal", true, "Female"));
		mLADTOs.add(new MLADTO("D. K. Shivakumar", 70, "Kanakapura", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("H. D. Kumaraswamy", 71, "Channapattna", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Dr. K. Annadani", 42, "Malavalli", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("D. C. Thammanna", 43, "Maddur", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("C. S. Puttaraju", 44, "Melukote", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("M. Srinivas", 45, "Mandya", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Ravindra Srikantaiah", 46, "Shrirangapattana", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Suresh Gowda", 47, "Nagamangala", "Janata Dal", true, "male"));

		mLADTOs.add(new MLADTO("Narayana Gowda", 48, "Krishnarajpet", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("C. N. Balakrishna", 49, "Shravanabelagola", " Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("K. M. Shivalingegowda", 50, "Arsikere", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("K. S. Lingesha", 51, "Belur", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Preetham J. Gowda", 52, "Hassan", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("H. D. Revanna", 53, "Holenarasipur", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Vacance", 54, "Arkalgud", "------", true, "------"));
		mLADTOs.add(new MLADTO("H. K. Kumaraswamy", 55, "Sakleshpur", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Harish Poonja", 56, "Belthangady", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("Umanatha A. Kotian", 57, "Moodabidri", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Bharath Shetty", 58, "Mangalore City North", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(
				new MLADTO("D. Vedavyas Kamath", 59, "	Mangalore City South", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("U. T. Khader", 60, "Mangalore", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Rajesh Naik", 61, "Bantval", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Sanjeeva Matandoor", 62, "Puttur", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Angara S", 63, "Sullia", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Appachu Ranjan", 64, "Madikeri", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("K. G. Bopaiah", 65, "Virajpet", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("K. Mahadeva", 66, "Periyapatna", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("S. R. Mahesh", 67, "Krishnarajanagara", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("H. P. Manjunath", 68, "Hunsuru", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Anil Kumar C", 69, "Heggadadevankote", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Harshavardhan B.", 70, "Nanjangud", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("GT Devegowda", 71, "Chamundeshwari", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("S. A. Ramadas", 72, "Krishnaraja", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("L. Nagendra", 73, "Chamaraja", "Bharatiya Janata Party", true, "male"));
		mLADTOs.add(new MLADTO("Tanveer Sait", 74, "Narasimharaja", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Yathindra S.", 75, "	Varuna", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("Ashvin Kumar M.", 54, "T Narasipura", "Janata Dal", true, "male"));
		mLADTOs.add(new MLADTO("R. Narendra", 55, "Hanur", "Congress", true, "male"));
		mLADTOs.add(new MLADTO("N. Mahesh", 56, "Kollegal", "Bharatiya Janata Party", true, "male"));

		mLADTOs.add(new MLADTO("C. Puttarangashetty", 56, "Chamrajanagar", "Congress", true, "male"));

		mLADTOs.add(new MLADTO("Vinisha Nero", 56, "Anglo-Indian", "Bharatiya Janata Party", true, "male"));

		mLADTOs.add(new MLADTO("C.S. Niranjan Kumar", 56, "Gundlupet", "Bharatiya Janata Party", true, "male"));

		System.out.println("tota MLAs :" + mLADTOs.size());
		System.out.println("age<50...........");
		mLADTOs.stream().filter(e -> e.getAge() < 50).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getAge() + "] [ " + e.getName()));
		System.out.println("age>50...........");
		mLADTOs.stream().filter(ele -> ele.getAge() > 50).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getAge() + "] [" + e.getParty()));
		System.out.println("All male MLAs..........");
		mLADTOs.stream().filter(ele -> ele.getGender().endsWith("male")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getName() + "][" + e.getGender()));
		System.out.println("All Female MLAs...........");
		mLADTOs.stream().filter(ele -> ele.getGender().endsWith("Female")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getName() + "][ " + e.getGender()));
		
		System.out.println("Sorting party in Ascending Order........");
		mLADTOs.stream().map(e -> e.getParty()).collect(Collectors.toSet()).stream().sorted()
				.forEach(e -> System.out.println(e));
		
		System.out.println("Sorting names in  Ascending Order...........");
		mLADTOs.stream().sorted((ref1, ref2) -> ref1.getName().compareTo(ref2.getName())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("Sorting age in Descending Order...........");
		mLADTOs.stream().sorted((ref1, ref2) -> ref2.getAge().compareTo(ref1.getAge())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("All MLAs by Party............");
		mLADTOs.stream().filter(e -> e.getParty().equals("Bharatiya Janata Party")).collect(Collectors.toSet())
				.forEach(e -> System.out.println(e));

		System.out.println("Finding unique Parties.............");
		mLADTOs.stream().map(e -> e.getParty()).collect(Collectors.toSet()).forEach(e -> System.out.println(e));

		System.out.println("Finding all independent MLAs..........");

		mLADTOs.stream().filter(e -> e.isIndependent()).collect(Collectors.toList())
				.forEach(ml -> System.out.println(ml.getName()));

		System.out.println("Finding All mla age>50 & party is BJP.............");

		mLADTOs.stream().filter(ele -> ele.getAge() > 50 && ele.getParty().equals("Bharatiya Janata Party"))
				.collect(Collectors.toList()).forEach(m -> System.out.println(m.getName()));
	}

}
