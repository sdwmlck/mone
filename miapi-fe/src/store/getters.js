const getters = {
  sidebar: state => state.app.sidebar,
  size: state => state.app.size,
  visitedViews: state => state.tagsView.visitedViews,
  cachedViews: state => state.tagsView.cachedViews,
  roles: state => state.user.roles,
  permission_routes: state => state.permission.routes,
  language: state => state.permission.language,
  projectList: state => state.projectlist.projectList,
  focusProjectList: state => state.projectlist.focusProjectList,
  currentKey: state => state.projectlist.currentKey,
  showFixedGroup: state => state.projectlist.showFixedGroup,
  selectedProjectGroup: state => state.projectlist.selectedProjectGroup,
  groupList: state => state.apilist.groupList,
  apiList: state => state.apilist.apiList,
  apiCount: state => state.apilist.apiCount,
  apiDetail: state => state.apilist.apiDetail,
  customMockUrl: state => state.apilist.customMockUrl,
  groupDesc: state => state.apilist.groupDesc,
  isEditDetail: state => state.apilist.isEditDetail,
  detailGroupList: state => state.apilist.detailGroupList,
  apiDetailActiveTab: state => state.apilist.apiDetailActiveTab,
  groupID: state => state.apilist.groupID,
  editValid: state => state['apilist.add'].editValid,
  httpParam: state => state['apilist.add'].httpParam,
  addApiStep: state => state['apilist.add'].step,
  addApiProtocol: state => state['apilist.add'].addApiProtocol,
  dubboParam: state => state['apilist.add'].dubboParam,
  dubboIpPort: state => state['apilist.add'].ipPort,
  dubboServiceName: state => state['apilist.add'].serviceName,
  gatewayParam: state => state['apilist.add'].gatewayParam,
  isDubboNewAdd: state => state['apilist.add'].isDubboNewAdd,
  isHttpNewAdd: state => state['apilist.add'].isHttpNewAdd,
  apiRawIsError: state => state['apilist.add'].rawIsError,
  batchAddHttpParam: state => state['apilist.add'].batchAddHttpParam,
  grpcParam: state => state['apilist.add'].grpcParam,
  updateGrpcParam: state => state['apilist.add'].updateGrpcParam,
  docList: state => state.projectdoc.docList,
  selfUserInfo: state => state.users.selfUserInfo,
  indexGroupList: state => state.apiindex.indexGroupList,
  showShareDialog: state => state.apiindex.showShareDialog,
  indexGroupID: state => state.apiindex.indexGroupID,
  indexApiList: state => state.apiindex.indexApiList,
  errorLogs: state => state.errorLog.logs,
  projectDetail: state => state['summary.base'].projectDetail,
  projectGroups: state => state.projectlist.projectGroups,
  groupComp: state => state['apilist.group'].groupComp,
  groupType: state => state['apilist.group'].groupType,
  importGroupList: state => state['apilist.import'].importGroupList,
  imoprtInitSubMenu: state => state['apilist.import'].imoprtInitSubMenu,
  curSubMenu: state => state['apilist.import'].curSubMenu,
  selectApiIds: state => state['apilist.import'].selectApiIds,
  mockData: state => state.addmock.mockData,
  apiTestProtocol: state => state.apitest.apiTestProtocol,
  isClickCase: state => state.apitest.isClickCase,
  dubboNamespace: state => state.apitest.dubboNamespace,
  dubboTestTag: state => state.apitest.dubboTag,
  apiTestHeaders: state => state.apitest.headers,
  apiTestBody: state => state.apitest.body,
  apiTestQuery: state => state.apitest.query,
  apiTestJsonBody: state => state.apitest.jsonBody,
  apiTestRequestType: state => state.apitest.requestType,
  apiTestUrl: state => state.apitest.url,
  apiTestBodyType: state => state.apitest.apiTestBodyType,
  apiTestVersion: state => state.apitest.version,
  apiTestParamType: state => state.apitest.paramType,
  apiTestParameter: state => state.apitest.parameter,
  apiTestAddr: state => state.apitest.addr,
  apiTestRetries: state => state.apitest.retries,
  apiTestIsGenParam: state => state.apitest.isGenParam,
  apiTestAttachments: state => state.apitest.attachments,
  selectCaseId: state => state.apitest.selectCaseId,
  dubboTestEnv: state => state.apitest.dubboEnv,
  hasAttachment: state => state.apitest.hasAttachment,
  serviceNameGroup: state => state.apitest.serviceNameGroup,
  apiTestGroup: state => state.apitest.group,
  apiTestMethodName: state => state.apitest.methodName,
  requestEnvHeader: state => state.apitest.requestEnvHeader,
  apiTestInterfaceName: state => state.apitest.interfaceName,
  apiTestDubboTimeout: state => state.apitest.timeout,
  apiTestIp: state => state.apitest.ip,
  isTestRequestEnd: state => state.apitest.isRequestEnd,
  apiTestResponse: state => state.apitest.response,
  apiTestDefaultHeader: state => state.apitest.defaultHeader,
  grpcParams: state => state.apitest.grpcParams,
  hostEnvList: state => state.apitest.hostEnvList,
  X5Param: state => state.apitest.X5Param,
  httpEnv: state => state.apitest.httpEnv,
  pageInfoList: state => state.shareindex.pageInfoList,
  shareApiDetail: state => state.shareindex.shareApiDetail,
  initPageInfoList: state => state.shareindex.initPageInfoList,
  shareShowIndexDoc: state => state.shareindex.showIndexDoc,
  envData: state => state.addEnv.envData
}
export default getters
