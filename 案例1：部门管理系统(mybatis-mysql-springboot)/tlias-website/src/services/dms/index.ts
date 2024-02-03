import { request } from '@umijs/max';

export async function deptList(params: any) {
    return request('/dept', {
        method: 'GET',
        params: {
            ...params,
        },
    });
}