package it.altralogica.cache;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanis on 18/05/17.
 */
@Service
public class FileServerService {

    private final HazelcastInstance hazelcastInstance;

    @Autowired
    public FileServerService(HazelcastInstance hazelcastInstance) {
        this.hazelcastInstance = hazelcastInstance;
    }

    public void init() {
        List<FileModel> list = new ArrayList<FileModel>();
        list.add(new FileModel("pippo.xml", 1234));
        hazelcastInstance.getList("files").addAll(list);
    }

    public List<FileModel>findAll() {
        List<FileModel> list = new ArrayList<FileModel>();
        list = hazelcastInstance.getList("files");
        return list;
    }
}
