package bank.app;

import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;

public class Invoice {

  private Long ID;
  private Nip sellerNIP;
  private Nip buyerNIP;
  private LocalDate invoiceDate;
  private LocalDate paymentDate;
  private Double gross;
  private Double netto;
  private Integer VAT;
  private String number;
    
}
