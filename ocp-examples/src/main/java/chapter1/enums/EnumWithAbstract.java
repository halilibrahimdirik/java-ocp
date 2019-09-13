package chapter1.enums;

import java.util.Random;

public enum EnumWithAbstract implements Price {

	ARCHER {
		@Override
		public double attack() {
			return new Random().nextInt(20);
		}

		@Override
		public double attackConcrete() {
			return new Random().nextInt(20);
		}

		@Override
		public double price() {
			// TODO Auto-generated method stub
			return 0;
		}
	},
	WIZARD {
		@Override
		public double attack() {
			return new Random().nextInt(30);
		}

		@Override
		public double price() {
			// TODO Auto-generated method stub
			return 0;
		}
	},
	KNIGHT {
		@Override
		public double attack() {
			return new Random().nextInt(40);
		}

		@Override
		public double price() {
			// TODO Auto-generated method stub
			return 0;
		}
	};

	// calculates damage related to character type
	public abstract double attack();

	public double attackConcrete() {
		return 0;
	}

}
