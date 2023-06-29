package Es1;


public class App {

	public static void main(String[] args) {
		// ***********************************************************
		Dipendente dipendente1 = new Dipendente(1202, Dipartimento.PRODUZIONE);
		System.out.println("Dipendente 1:");
		dipendente1.stampaDatiDipendente();

		System.out.println("Stipendio mensile di dipendente1: " + Dipendente.calcolaPaga(dipendente1));

		dipendente1.promuovi();
		System.out.println("Nuovo livello di dipendente1: " + dipendente1.getLivello());

		// ***********************************************************
		Dipendente dipendente2 = new Dipendente(2303, 1500, 40, Livello.QUADRO, Dipartimento.AMMINISTRAZIONE);
		System.out.println("Dipendente 2");
		dipendente2.stampaDatiDipendente();

		int oreStraordinario = 10;
		System.out.println("Stipendio mensile di dipendente2 con " + oreStraordinario + " ore di straordinario: "
				+ Dipendente.calcolaPaga(dipendente2, oreStraordinario));

		dipendente2.setImportoOrarioStraordinario(50);
		System.out.println(
				"Nuovo importo orario straordinario di dipendente2: " + dipendente2.getImportoOrarioStraordinario());
	}

}
