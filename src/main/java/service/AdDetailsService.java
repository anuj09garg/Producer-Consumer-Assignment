package service;

import model.AdDetail;
import org.springframework.stereotype.Service;

@Service
public interface AdDetailsService {
    boolean saveAdDetailsToDB();

    boolean saveAdDetailsToMap(AdDetail adDetail);
}
