package bank.app;

import java.time.LocalDate;

public class Invoice {

  private Long ID;
  private Nip sellerNIP;
  private Nip buyerNIP;
  private LocalDate invoiceDate;
  private LocalDate paymentDate;
  private Double gross;
  private Double net;
  private Integer VAT;
  private String number;

}
