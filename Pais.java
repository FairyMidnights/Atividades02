

public class Pais {
	 
	    private int PaisId;
		private char PaisNome;
		private int PaisPopulacao;
		private int PaisArea;

		public Pais() {
		}

		public int getPaisId() {
			return PaisId;
		}

		public void setPaisId(int PaisId) {
			this.PaisId = PaisId;
		}

		public char getPaisNome() {
			return  PaisNome;
		}

		public void setPaisNome(char PaisNome) {
			this.PaisNome = PaisNome;
		}

		public int getPaisPopulacao() {
			return PaisPopulacao;
		}

		public void setPaisPopulacao(int PaisPopulacao) {
			this.PaisPopulacao = PaisPopulacao;
		}

		public int getPaisArea() {
			return PaisArea;
		}

		public void setPaisArea(int PaisArea) {
			this.PaisArea = PaisArea;
		}
		
		
		@Override
		public String toString() {
			return "Cliente [PaisId=" + PaisId + ", PaisNome=" + PaisNome + ", PaisPopulacao=" + PaisPopulacao
					+ ", PaisArea=" + PaisArea + "]";
		}

		
	    
	}


