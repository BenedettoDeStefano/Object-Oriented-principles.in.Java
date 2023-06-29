package Es1;

public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente operaio1 = new Dipendente(1, Dipartimento.PRODUZIONE);
		Dipendente operaio2 = new Dipendente(2, Dipartimento.PRODUZIONE);
		Dipendente impiegato = new Dipendente(3, Dipartimento.AMMINISTRAZIONE);
		Dipendente dirigente = new Dipendente(4, Dipartimento.VENDITE);

		operaio1.promuovi();
		impiegato.promuovi();

		System.out.println("Stato dipendenti:");
		operaio1.stampaDatiDipendente();
		operaio2.stampaDatiDipendente();
		impiegato.stampaDatiDipendente();
		dirigente.stampaDatiDipendente();

		double stipendiTotali = Dipendente.calcolaPaga(operaio1, 4) + Dipendente.calcolaPaga(operaio2, 6)
				+ Dipendente.calcolaPaga(impiegato, 2) + Dipendente.calcolaPaga(dirigente, 5);

		System.out.println("Somma totale degli stipendi comprese ore di straordinario :  " + stipendiTotali);
	}

}
