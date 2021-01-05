package me.jay.patterns.observer1;

public class Button {

	private OnClickListener onClickListener;

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	public void onClick() {
		// click event 발생 시 event 처리
		if (onClickListener != null) {
			onClickListener.onClick(this);
		}
	}

	public interface OnClickListener {
		public void onClick(Button button);
	}

}
