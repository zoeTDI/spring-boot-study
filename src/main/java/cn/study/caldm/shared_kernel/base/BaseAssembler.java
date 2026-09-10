package cn.study.caldm.shared_kernel.base;

import java.util.Collections;
import java.util.List;

public interface BaseAssembler<D, P> {

    D toDomain(P po);

    default List<D> toDomainList(List<P> poList) {
        if (poList == null || poList.isEmpty()) {
            return Collections.emptyList();
        }
        return poList.stream()
                .map(this::toDomain)
                .toList();
    }

    P toPo(D domain);

    default List<P> toPoList(List<D> domainList) {
        if (domainList == null || domainList.isEmpty()) {
            return Collections.emptyList();
        }
        return domainList.stream()
                .map(this::toPo)
                .toList();
    }
}
