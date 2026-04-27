class WhatsApp
{
	public static void send(String text){
		System.out.println("Send only message;"+text);
	}
	public static void send(long contacts){
		System.out.println("Send only contacts;"+contacts);
	}
	public static void send(String text, long contacts){
		System.out.println("Send both message and contacts;"+text+" " + contacts);
	}
	public static void send( long contacts, String text){
		System.out.println("Send first contacts then message;"+contacts+ " " +text);
	}
	public static void main(String[] args){
		send("Shanta");
		send(7676651933L);
		send("Shreya", 9876541398972L);
		send(1234567889L, "Sneha");
	}

}