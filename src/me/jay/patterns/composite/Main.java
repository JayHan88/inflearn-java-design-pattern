package me.jay.patterns.composite;

public class Main {

	private static void showFolder(Component component) {
		System.out.println(component.getClass().getName()+"|"+component.getName());
		if (component instanceof Folder) {
			for (Component c : ((Folder) component).getChildren()) {
				showFolder(c);
			}
		}
	}

	public static void main(String[] args) {

		Folder root = new Folder("root");
		Folder home = new Folder("home");
		Folder jay = new Folder("jay");
		Folder music = new Folder("music");
		Folder picture = new Folder("picture");
		Folder doc = new Folder("doc");
		Folder usr = new Folder("usr");

		File track1 = new File("track1");
		File track2 = new File("track2");
		File pic1 = new File("pic1");
		File doc1 = new File("doc1");
		File java = new File("java");

		root.addComponent(home);
			home.addComponent(jay);
				jay.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2);
				jay.addComponent(picture);
					picture.addComponent(pic1);
				jay.addComponent(doc);
					doc.addComponent(doc1);
		root.addComponent(usr);
			usr.addComponent(java);

		showFolder(root);
	}

}
