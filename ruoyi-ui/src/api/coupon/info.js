import request from '@/utils/request'

// 查询提货券信息列表
export function listInfo(query) {
  return request({
    url: '/coupon/info/list',
    method: 'get',
    params: query
  })
}

// 查询提货券信息详细
export function getInfo(id) {
  return request({
    url: '/coupon/info/' + id,
    method: 'get'
  })
}

// 新增提货券信息
export function addInfo(data) {
  return request({
    url: '/coupon/info',
    method: 'post',
    data: data
  })
}

// 修改提货券信息
export function updateInfo(data) {
  return request({
    url: '/coupon/info',
    method: 'put',
    data: data
  })
}

// 删除提货券信息
export function delInfo(id) {
  return request({
    url: '/coupon/info/' + id,
    method: 'delete'
  })
}
