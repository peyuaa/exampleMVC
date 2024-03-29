package mvc.model;

import mvc.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model{
	private ModelData modelData = new ModelData();

	@Override
	public ModelData getModelData() {
		return modelData;
	}

	@Override
	public void loadUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User("Dima", 358, 26));
		users.add(new User("Maksim", 111, 66));
		modelData.setUsers(users);
	}

	@Override
	public void loadDeletedUsers() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void loadUserById(long userId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteUserById(long id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void changeUserData(String name, long id, int level) {
		throw new UnsupportedOperationException();
	}
}
