package enums;

public enum LotrCharacter {
	
	FRODO {
		@Override
		public String getName() {
			return "Frodo";
		}
	},
	SAM  {
		@Override
		public String getName() {
			return "Sam";
		}
	},
	PIPPIN  {
		@Override
		public String getName() {
			return "Pippin";
		}
	},
	MERRY {
		@Override
		public String getName() {
			return "Merry";
		}
	},
	FATTY_BOLGER {
		@Override
		public String getName() {
			return "Fatty Bolger";
		}
	},
	SAURON {
		@Override
		public String getName() {
			return "Sauron";
		}
	};

	public abstract String getName();
	
}
