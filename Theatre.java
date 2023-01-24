class Theatre{
int total;
public static void main(String args[]){
Theatre raja = new Theatre();
int balance = raja.bookTicket(200);
System.out.println("After Booking Ticket "+balance);
}

int bookTicket(int total){
this.total = total;
int ticket_price = 120;
int balance = total - ticket_price;
return balance;
}

}
